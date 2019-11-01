package com.company.tryreader;

import java.io.*;

public class Iotest01 {

    public static void main(String[] args) {
        File file = new File("try.txt");
        try {

            /*
            一、FileInputStream
           InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(bytes)) != -1){
                    String string = new String(bytes, 0, len);
                System.out.println(string);
            }
            char data1 = (char) inputStream.read();
            System.out.println(data1);
            inputStream.close();
            */


            /*
            二、FileOutputStream
            OutputStream outputStream = new FileOutputStream(file);
            String msg = "asddf eetifj";
            String  msg2 = "一二三四";
            byte[] bytes = msg.getBytes();
            byte[] bytes1 = msg2.getBytes();
            outputStream.write(bytes, 0, bytes.length);
            outputStream.write(bytes1, 0, bytes1.length);//会直接在后面追加，而不是覆盖
            outputStream.flush();
            outputStream.close();
            */


           /*
           三、FileReader
            Reader reader = new FileReader(file);
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1){
                String string = new String(flush, 0, flush.length);
                System.out.println(string);
            }
            */


            /*
            四、FileWriter
            Writer writer = new FileWriter(file, true);
            String msg = "一二三十四物流七八";
            char[] chars = msg.toCharArray();
           // writer.write(msg);
            writer.write(chars);
            writer.flush();
            writer.close();
            */


            /*
            五、BufferedInputStream，耗费时间比InputStream少
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = bufferedInputStream.read(bytes)) != -1){
                    String string = new String(bytes, 0, len);
                System.out.println(string);
            }
            */


          /*
           六、BufferedOutputStream，耗费时间比OutputStream少
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            String msg = "asddf eetifj";
            byte[] bytes1 = msg.getBytes();
            bufferedOutputStream.write(bytes1, 0, bytes1.length);//会直接在后面追加，而不是覆盖
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            */


           /*
           七、BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
            */


           /*
           八、BufferedWriter
            BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
            String msg = "一二三十四物流七八";
            char[] chars = msg.toCharArray();
           // writer.write(msg);
            writer.write(chars);
            writer.flush();
            writer.close();
            */


            /*
            九、InputStreamReader和OutputStreamWriter
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String msg = "";
            while (!msg.equals("#")){
                msg = bufferedReader.readLine();
                bufferedWriter.write(msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            BufferedReader和InputStreamReader不会出现乱码，InputStream会
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://www.baidu.com").openStream(),"utf-8"));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
            //InputStreamReader inputStreamReader = new InputStreamReader(new URL("https://www.baidu.com").openStream(),"utf-8");
            String temp;
            while ((temp = bufferedReader.readLine()) != null){
                   bufferedWriter.write(temp);
                   bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            */


            /*
            十、DataOutputStream和DataInputStream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF("一二三");
            dataOutputStream.writeInt(8);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeChar('a');
            dataOutputStream.flush();
            byte[] bytes = byteArrayOutputStream.toByteArray();

            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bytes));
            //顺序要与写出的保持一致
            String msg = dataInputStream.readUTF();
            int age = dataInputStream.readInt();
            boolean flag = dataInputStream.readBoolean();
            char ch = dataInputStream.readChar();
            System.out.println(msg);
            System.out.println(age);
            System.out.println(flag);
            System.out.println(ch);
            */



            /*
            十一、ObjectOutputStream和ObjectInputStream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            objectOutputStream.writeUTF("一二三");
            objectOutputStream.writeInt(8);
            objectOutputStream.writeBoolean(false);
            objectOutputStream.writeChar('a');
            objectOutputStream.writeObject("四五六");
            objectOutputStream.writeObject(new Date());
            objectOutputStream.writeObject(new User("淤泥","123456677"));
            objectOutputStream.flush();
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            //顺序要与写出的保持一致
            String msg = objectInputStream.readUTF();
            int age = objectInputStream.readInt();
            boolean flag = objectInputStream.readBoolean();
            char ch = objectInputStream.readChar();
            String mmsg = (String)objectInputStream.readObject();
            Date date = (Date) objectInputStream.readObject();
            User user = (User) objectInputStream.readObject();
            System.out.println(msg);
            System.out.println(age);
            System.out.println(flag);
            System.out.println(ch);
            System.out.println(mmsg);
            System.out.println(date);
            System.out.println(user);
            objectInputStream.close();
            */

           /*
           十二、PrintStream
           PrintStream printStream = new PrintStream(new BufferedOutputStream(new FileOutputStream(file)),true);
            printStream.println("打印六");
            printStream.println(true);
            printStream.close();
            */


            /*
            十三、PrintWriter
            PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file)),true);
            printWriter.println("打印里");
            printWriter.println(true);
            printWriter.close();
            */




        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
