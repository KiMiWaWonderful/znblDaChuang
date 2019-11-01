package com.company.server;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getByName("192.168.123.158"),33333);

//        OutputStream outputStreamWriter = socket.getOutputStream();
//        OutputStreamWriter osw = new OutputStreamWriter(outputStreamWriter, "ASCII");
//        osw.write("abc");

//        InputStream inputStream = socket.getInputStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

//        String re = bufferedReader.readLine();
//        System.out.println(re);

//        String[] strings = new String[]{
//                "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE",
//                "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE",
//                "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE"
//        };

        String string = "id=      TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVETM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE" ;
        String string1 = "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVETM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE" ;

       // printWriter.println(strings);
       // printWriter.append(string);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    printWriter.println(string);
//                    printWriter.flush();
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    printWriter.println(string1);
//                    printWriter.flush();
//                }
//
//            }
//        }).start();

        printWriter.println(string);
        printWriter.flush();
        printWriter.println(string1);
        printWriter.flush();



//        osw.close();
//        outputStreamWriter.close();
//        socket.close();

    }
}
