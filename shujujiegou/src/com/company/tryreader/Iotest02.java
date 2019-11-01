package com.company.tryreader;

import java.io.*;

public class Iotest02 {

    public static void main(String[] args) {

        byte[] bytes = fileToByteArray("E:\\w.jpg");
        //System.out.println(bytes.length);
        byteArrayToFile(bytes,"w-byte.jpg");
    }

    public static byte[] fileToByteArray(String filePath){

        File file = new File(filePath);
        byte[] dest = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            inputStream = new FileInputStream(file);
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] flush = new byte[1024*10];
            int len = -1;
            while ((len = inputStream.read(flush)) != -1){
                   byteArrayOutputStream.write(flush, 0, len);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void byteArrayToFile(byte[] bytes,String filePath)  {

        File dest = new File(filePath);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        inputStream = new ByteArrayInputStream(bytes);
        try {
            outputStream = new FileOutputStream(dest);
            byte[] flush = new byte[5];
            int len = -1;
            while ((len = inputStream.read(flush)) != -1){
              outputStream.write(flush, 0, len);
            }
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
