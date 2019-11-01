package com.company.tryreader;

import java.io.*;

public class Reader {



    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        String[] strings;
        String response = null;
        try {
            File file = new File("E:\\try.txt");

            //第一种方法：可以使用FileInputStream
            //得到结果：
//            26 80 Sunny ON ON 100 40 ON ON PMLEAVE //这个似乎是编码问题
//            26 80 Sunny ON ON 100 40 ON ON LEAVE
            InputStream inputStream = new FileInputStream(file);
//            byte[] bytes = new byte[1000];
//            int len = -1;
//            while ((len = inputStream.read(bytes)) != -1){
//                response = new String(bytes, 0, len);
//                System.out.println(response);
//            }

            //第二种方法：bufferedReader。但readLine()似乎只读取到第一行的数据
            //思考如何让它读取到多行数据
            //得到结果：26 80 Sunny ON ON 100 40 ON ON LEAVE
            bufferedReader = new BufferedReader(new FileReader(file));
            response = bufferedReader.readLine();
//           String str = null;
//            while ((response = bufferedReader.readLine()) != null){
//                      //response = bufferedReader.readLine();
//                //System.out.println(response);
//                str = response;
//            }
//           System.out.println(str);

            //第三种方法，使用FileReader，结果与第一种一样
//            java.io.Reader reader = new FileReader(file);
//            char[] flush = new char[1024];
//            int len = -1;
//            while ((len = reader.read(flush)) != -1){
//                response = new String(flush, 0, flush.length);
//                System.out.println(response);
//            }

            //StringBuilder stringBuilder = new StringBuilder();
//           while (( bufferedReader.read()) != -1) {
//                stringBuilder.append((char) bufferedReader.read());
//            }
//            while (( inputStream.read()) != -1) {
//                stringBuilder.append((char) inputStream.read());
//            }
           // String response = stringBuilder.toString();
          //  System.out.println(response);

            strings = response.split("_");
           // strings = str.split("_");

            for (int i = 0; i <strings.length ; i++) {
                System.out.print(strings[i] + " ");
            }

            System.out.println();

            for (int i = 0; i <strings.length ; i++) {
                final int index = i;
                if(strings[i].contains("id=")){
                   // strings[i] = strings[i].replace("id=","");
                    char[] c = strings[i].toCharArray();
                    for (int j = 0; j <c.length ; j++) {
                        if(c[j] == 'T'){
                            strings[i] = strings[i].substring(j,c.length);
                        }
                    }
                }
                if(strings[i].contains("TM")){
                    strings[i] = strings[i].replace("TM","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("HM")){
                    strings[i] = strings[i].replace("HM","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("WE")){
                   strings[i] = strings[i].replace("WE","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("AR")){
                   strings[i] = strings[i].replace("AR","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("HT")){
                    strings[i] = strings[i].replace("HT","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("LS")){
                    strings[i] = strings[i].replace("LS","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("SMS")){
                   strings[i] = strings[i].replace("SMS","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("SSO")){
                    strings[i] = strings[i].replace("SSO","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("SST")){
                  strings[i] = strings[i].replace("SST","");
                    System.out.println(strings[i]);
                }else if(strings[i].contains("PM")){
                    strings[i] = strings[i].replace("PM","");
                    System.out.println(strings[i]);
                }
            }

            for (int i = 0; i <strings.length ; i++) {
                System.out.print(strings[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    

}
