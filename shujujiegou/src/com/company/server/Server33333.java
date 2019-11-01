package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Server33333 {
    // 等待连接用的的socket
    private ServerSocket server;
    // ID分配模式
    private int idmode;
    // 服务器分配ID模式下当前最大的ID，新ID在此基础上加一
    private Integer curmaxid = 0;
    // 新建一个Map集合，用来存放客户端，以便能指定客户端转发数据  key为客户端ID，Value为Socket
    private Map<String, Socket> clientList = new HashMap<>();

    /**
     * 构造方法
     * @param Port 监听的端口
     * @param IDMode ID来源模式，0是服务器分配ID模式，1是客户端发ID模式
     */
    public Server33333(int Port, int IDMode)
    {
        idmode = IDMode;

        try{
            //新建socket对象并且监听端口
            server = new ServerSocket(Port);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 服务端发数据到所有其他的客户端，除srcID指定的数据来源客户端外
     * @param msg 要转发的数据
     * @param srcID 数据的来源ID
     */
    private void ServerSendToClient(byte[] msg, int len, String srcID)
    {
        // 获取迭代器
        Iterator<Entry<String, Socket>> it =
                clientList.entrySet().iterator();

        while(it.hasNext())
        {
            // 取出下一个迭代器的内容
            Entry<String, Socket> nvp = it.next();
            // 判断是否是数据源，是就跳过
            if(srcID.equals(nvp.getKey()))continue;

            try
            {
                OutputStream out = nvp.getValue().getOutputStream();
                out.write(msg, 0, len);
                out.flush();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * 服务端发数据到destID指定客户端，即使某个列表中的
     * 客户端没找到，还是会尝试发送给列表后面的客户端。
     * @param msg 要转发的数据
     * @param destID 要转发到的客户端的ID列表
     */
    private void ServerSendToClient(byte[] msg, int len, String[] destID)
    {
        for(String s : destID)
        {
            Socket sock = clientList.get(s);
            if(sock == null)continue;

            try
            {
                OutputStream out = sock.getOutputStream();
                out.write(msg, 0, len);
                out.flush();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    /**
     * 主线程开始监听工作，等待客户端连接
     */
    public void start(){
        try{
            while(true)
            {
                System.out.println("等待客户端连接");
                Socket socket = server.accept();
                // 当一个客户端连接上之后启动一个线程，来负责这个客户端进行交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                // 取得
                t.start();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 子线程，该线程用来与一个客户端进行交互，每一个客户端连接上都会启动这个线程
     * @author gelo
     */
    private class ClientHandler implements Runnable
    {
        // 当前客户端的socket
        private Socket socket;
        // 当前客户端的ID
        private String thisID = null;

        /**
         * 分配或获取一个ID
         * @throws IOException 分配ID后发送失败或者2秒内没收到客户端发来的setid指令时抛出
         */
        private void AllocID() throws IOException
        {
            // 服务器分配ID模式
            if(idmode == 0)
            {
                // 分配ID
                curmaxid++;
                thisID = curmaxid.toString();
            }
            // 客户端提交ID模式
            else
            {
                byte[] buf = new byte[128];
                // 设置30秒超时
                socket.setSoTimeout(30000);
                // 接收ID
                InputStream in = socket.getInputStream();
                int len = in.read(buf);
                // 分析
                String[] SetIDCmd = new String(buf, 0, len).split("=");

                // 确定是setid命令
                if(SetIDCmd[0].equals(">setid"))
                {
                    if(SetIDCmd[1] != null)
                    {
                        thisID = SetIDCmd[1];
                        // 取消接收超时
                        socket.setSoTimeout(0);

                    }
                    else throw new IOException();
                }
                else
                {
                    System.out.println("SetIDCmd[0]=" + SetIDCmd[0]);
                    throw new IOException();
                }
            }

            // 添加ID到socket的映射到map
            if(!clientList.containsKey(thisID))
                clientList.put(thisID, socket);
            else throw new IOException();

            // 发送id
            String IDStr = "id=" + thisID;
            OutputStream out = socket.getOutputStream();
            out.write(IDStr.getBytes());
            out.flush();
            System.out.println(thisID + "成功连接");
        }

        /**
         * 将整个客户端列表转换成一个字符串并发出去
         */
        private void HandleListCmd()
        {
            StringBuffer sb = new StringBuffer();

            // 获取迭代器
            Iterator<Entry<String, Socket>> it =
                    clientList.entrySet().iterator();

            while(it.hasNext())
            {
                // 取出下一个迭代器的内容
                Entry<String, Socket> nvp = it.next();
                Socket sock = nvp.getValue();
                String ip = sock.getInetAddress().getHostAddress();
                sb.append(nvp.getKey() + "," + ip + "," + sock.getPort() + ";");
            }

            try
            {
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out, "ASCII");
                osw.write(sb.toString());
                osw.flush();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        /**
         * 客户端处理线程的构造函数
         * socket 与客户端通信的socket
         */
        public ClientHandler(Socket sock){
            socket = sock;
        }

        /**
         * 重写Runnable中的run方法，作为线程的入口点函数
         */
        @Override
        public void run()
        {
            try
            {
                byte[] buff = new byte[1024];

                // 获取socket输入流，以得到客户端发送来的数据
                InputStream in = socket.getInputStream();

                // 分配ID或获取ID
                AllocID();

                // 不断等待接收客户端发来的数据
                while(true)
                {
                    int len = in.read(buff);
                    if(len == -1)throw new IOException();

                    // 可能是指令的开始
                    if(buff[0] == '>')
                    {
                        // 分析收到的内容
                        String trystr = new String(buff, 1, len);
                        String[] cmd = trystr.split("=");

                        switch (cmd[0])
                        {
                            case "list": HandleListCmd(); break;
                            case "disconnect": throw new IOException();
                            default: break;
                        }
                        continue;
                    }

                    // 可能是目的地列表的开始
                    if(buff[0] == '<')
                    {
                        int gt_loc = 0;
                        // 找出>的位置
                        for(; gt_loc < len && buff[gt_loc] != '>'; gt_loc++);

                        // 如果有右尖括号
                        if(gt_loc > 0 && gt_loc < len)
                        {
                            // 把左右尖括号之间的内容取出来，并以“,”打断
                            String IDs = new String(buff, 1, gt_loc-1);
                            String[] dest_list = IDs.split(",");
                            // 复制剩余部分
                            byte[] tmp = new byte[len - gt_loc - 1];
                            System.arraycopy(buff, gt_loc + 1, tmp, 0, len - gt_loc - 1);
                            // 发送
                            ServerSendToClient(tmp, tmp.length, dest_list);
                            continue;
                        }
                    }

                    // 都不是则原样转发给其他所有客户端
                    ServerSendToClient(buff, len, thisID);
                }
            }
            catch(IOException e)
            {
                //当客户端与服务器断开连接时候，应该将客户端从Map中删除
                clientList.remove(thisID);
                //关闭socket，释放出资源
                if(socket !=null)
                {
                    try{
                        socket.close();
                    }catch(IOException ioe){
                        ioe.printStackTrace();
                    }
                }
            }
        }

    }

    /**
     * main函数，可以传递如下的命令行参数：
     * <p>
     * (1)-port=##### 	（缺省值为33333）指定1024~65535之间的一个端口号
     * <p>
     * (2)-client-id	程序客户端决定ID模式启动，客户端连接成功后必须发送如下
     * 					命令设置自己的ID（详细参见使用手册）：
     * 						<p>>setid=此客户端的ID</p>
     * 					服务器收到ID后会以如下格式回复客户端：id=收到的ID
     * <p>
     * (3)-server-id	（缺省）程序以服务器分配ID方式启动，客户端连接成功后
     * 					服务器会直接向客户端发送分配给此客户端的ID，格式同上
     *
     * @param args 命令行参数
     */
    public static void main(String[] args)
    {
        // mode 0是服务器分配ID方式，1是客户端决定ID方式
        int port=33333, mode=0;

        // 分析命令行
        if(args.length > 0)
        {
            for(String s : args)
            {
                if(s.substring(0, "-port=".length()).equals("-port="))
                {
                    String[] cmdport = s.split("=");
                    port = Integer.parseInt(cmdport[1]);
                }

                if(s.equals("-client-id")) mode = 1;
                if(s.equals("-server-id")) mode = 0;
            }
        }

        System.out.println(
                "端口：" + port + " " +
                        "模式：" + ((mode==0)?"服务器决定ID":"客户端决定ID"));

        // 创建对象
        Server33333 server = new Server33333(port, mode);
        // 启动等待
        server.start();
    }
}
