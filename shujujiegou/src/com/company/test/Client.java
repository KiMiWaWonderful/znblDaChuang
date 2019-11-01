package com.company.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private Socket sck=null;
    private String iuput=""; //输入流的容器 存放输入的容器
    private String output=""; //输出流的容器 存放输出的容器
    boolean flag=true;
    boolean flag2=true;
    public static void main(String[] args) {
        Client Test=new Client();
        Test.getStart();
    }

    public void getStart(){
        Input I=new Input();
        Output O=new Output();
        Link L=new Link();
        Thread T=new Thread(I,"输入流");
        Thread T2=new Thread(O,"输出流");
        Thread T3=new Thread(L,"客户端");
        T2.setDaemon(true);  //设置为守护线程  该线程结束  后台线程也会跟随着结束
        T3.start(); //启动客户端
        T3.setPriority(Thread.MAX_PRIORITY);  //设置线程的优先级
        T.start();
        T2.start();
        /**用线程睡的方法  保证  连接线程先启动
         *
         */
    }

    class Input implements Runnable{  //输入流  接受客户端消息的流

        @Override
        public void run() {
            if(flag){    //如果此线程先启  则让此线程先睡五秒
                try {
                    flag=false;
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (this) {
                try {
                    //this.wait();
                    BufferedReader br = new BufferedReader(new InputStreamReader(sck.getInputStream()));  //获取sck提供的输入流
                    while (true) {
                        iuput = br.readLine();  //获取流中的数据
                        if (iuput != null && iuput != "") {  //判断数据  为空则不进行输出  不为空则输出数据
                            System.out.println(iuput);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Output implements Runnable{

        @Override
        public void run() {
            if(flag2){   //如果此线程先启  则让此线程先睡五秒
                try {
                    flag2=false;
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //创建输入流  获取系统输入的数据
            while(true){
                try {
                    PrintWriter writer=new PrintWriter(sck.getOutputStream(),true);   //创建sckock提供的输出流
                    output=br.readLine();   //获取键盘输入赋值给uotput
                    writer.println("客户端发来信息：\t"+output);  //拼接字符串后写入输出流中
                    if(output.equals("exit")){   //输入exit  退出
                        System.out.println("谢谢使用！");
                        br.close();  //关闭流
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class Link implements Runnable{

        @Override
        public void run() {
            synchronized (this) {
                try {
                    sck = new Socket("127.0.0.1", 8888);  //链接 服务端
                    //this.notifyAll();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
