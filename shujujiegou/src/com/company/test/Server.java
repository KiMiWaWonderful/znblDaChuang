package com.company.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static ServerSocket ser=null;   //
    private static Socket sck=null;
    private static String output ="";  //输出流的容器 存放输出的数据
    private static String input=""; //输入流的容器  存放收到的数据
    boolean flag=true;
    boolean flag2=true;
    public static void main(String[] args) {
        Server Test=new Server();
        Test.getStart();
    }
    public void getStart(){
        Input O=new Input();
        Output I=new Output();
        monitor m=new monitor();
        Thread T=new Thread(I,"输入流");
        Thread T2=new Thread(O,"输出流");
        Thread T3=new Thread(m,"服务端");
        T3.start(); //启动服务端
        T3.setPriority(Thread.MAX_PRIORITY);  //将线程优先级设置为最高
        T.start();
        T2.start();
    }

    class Output implements Runnable{  //输出流  向服务端输出消息的流
        @Override
        public void run() {
            if(flag){   //如果此线程先启  则让此线程先睡五秒
                flag=false;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while (true) {
                synchronized (this) {
                    InputStreamReader isr=new InputStreamReader(System.in);
                    BufferedReader br=new BufferedReader(isr);
                    try {
                        //this.wait();
                        PrintWriter writer = new PrintWriter(sck.getOutputStream(), true);
                        output = br.readLine();
                        writer.println("服务端发来信息：\t"+output);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    class Input implements  Runnable{

        @Override
        public void run() {
            if(flag2){    //如果此线程先启  则让此线程先睡五秒
                try {
                    flag2=false;
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                BufferedReader br=new BufferedReader(new InputStreamReader(sck.getInputStream()));
                while (true){
                    input=br.readLine();
                    if(input.equals("客户端发来信息：\texit")){
                        System.out.println("客户端"+sck.getInetAddress()+":"+sck.getPort()+"\t下线了");
                        input="";
                    }
                    if(input!=null && input!=""){
                        System.out.println(input);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    class monitor implements Runnable{

        @Override
        public void run() {
            synchronized (this) {
                try {
                    ser = new ServerSocket(8888);
                    while (true) {
                        sck = ser.accept();
                        System.out.println(sck.getInetAddress() + ":" + sck.getPort() + "\t有一个客户端连接上来了！");
                        //this.notifyAll();  //唤醒其他所有线程
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
