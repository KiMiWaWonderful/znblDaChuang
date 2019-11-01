package com.company.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static byte[] readStream(InputStream inStream) throws Exception {
        int count = 0;
        while (count == 0) {
            count = inStream.available();
        }
        byte[] b = new byte[count];
        inStream.read(b);
        return b;
    }

    public static void main(String[] args) throws Exception {
        ServerSocket socket = new ServerSocket(33333);
        while (true){
            Socket socket1 = socket.accept();
            InputStream in = socket1.getInputStream();
            //InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

//            OutputStream outputStream = socket1.getOutputStream();
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//            PrintWriter printWriter = new PrintWriter(bufferedWriter);


            StringBuffer stringBuffer = new StringBuffer();
            byte[] bytes = readStream(in);
            String strRead = new String(bytes);
            strRead = String.copyValueOf(strRead.toCharArray(),0,bytes.length);
            System.out.println(strRead);

            String str = null;
            for (int i = 0; i <strRead.length() ; i++) {
                if(strRead.contains("T")){
                    str = strRead.substring(i,strRead.length());
                    break;
                }
            }
            System.out.println(str);
            String [] res = strRead.split("_");
            for (int i = 0; i <res.length ; i++) {
                System.out.print(i + ","+res[i] + " ");
            }

//            int len = 0;
//            char [] temp = new char[4096];
//            while ((len = bufferedReader.read()) != -1){
//                    bufferedReader.read(temp);
//            }
//            for (int i = 0; i <temp.length ; i++) {
//                stringBuffer.append(temp[i]);
//            }
//            System.out.println(stringBuffer.toString());
//            bufferedReader.read();
//
//            String s = bufferedReader.readLine();
//            System.out.println(s);
//            while ((s = bufferedReader.readLine()) != null){
//                stringBuffer.append(s);
//             //   stringBuffer.append("\n");
//            }
           // System.out.println(stringBuffer.toString());
//            String re = bufferedReader.readLine();
//            System.out.println(re);

//            String[] strings = new String[]{
//                    "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE",
//                    "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE",
//                    "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE"
//            };
//
//            String string = "TM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVETM26_HM80_WESunny_ARON_HTON_LS100_SMS40_SSOON_SSTON_PMLEAVE";

//            printWriter.println(strings);
//            printWriter.append(string);
        }

    }
}
