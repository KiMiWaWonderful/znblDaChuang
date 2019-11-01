package com.company.lanqiao;

import java.io.*;

public class ZiJieLiu {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\try.txt");
      InputStream fileInputStream = new FileInputStream(file);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
      //int len = -1;
      String b ;
      while ((b=bufferedReader.readLine()) != null){
          System.out.println(b);
      }
       // System.out.println(bufferedReader.readLine());

        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file)));
        printWriter.println("abcd");
        printWriter.flush();

        PrintWriter pw = new PrintWriter("E:\\try.txt","UTF-8");
        pw.write("nnnn");
       // pw.write(value2);
        pw.close();


//        int count = 0;
//        while (count == 0) {
//            count = fileInputStream.available();
//        }
//        byte[] b = new byte[count];
//        fileInputStream.read(b);
//        String strRead = new String(b);
//        strRead = String.copyValueOf(strRead.toCharArray(),0,b.length);
//        System.out.println(strRead);

      //  StringBuffer stringBuffer = new StringBuffer();
//        int len = -1;
//        byte[] bytes = new byte[1000];
//        while ((len = fileInputStream.read()) != -1){
//
//           String response = new String(bytes, 0, len);
//            System.out.println(response);
//           //stringBuffer.append(response);
//        }
       // System.out.println(stringBuffer.toString());
       // System.out.println(fileInputStream.read());
    }
}
