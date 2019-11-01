package com.example.utils;

import com.example.pojo.GPSInformation;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public  class SerialUtils {

    //构造串口
    public  static SerialPort constructPort(String portName) {
        //设置串口名
        SerialPort serialPort = new SerialPort(portName);
        try {
            // Open serial port
            serialPort.openPort();
            // Set params. Also you can set params by this string:
            // serialPort.setParams(9600, 8, 1, 0);
            serialPort.setParams(
                    //设置波特率
                    SerialPort.BAUDRATE_115200,
                    //设置数据位数
                    SerialPort.DATABITS_8,
                    //设置停止位
                    SerialPort.STOPBITS_1,
                    //设置奇偶校验
                    SerialPort.PARITY_NONE);

            //设置流控制
            serialPort.setFlowControlMode(0);
            //SerialPort.FLOWCONTROL_NONE


//            int mask = SerialPort.MASK_RXCHAR + SerialPort.MASK_CTS + SerialPort.MASK_DSR;//Prepare mask
//            serialPort.setEventsMask(mask);//Set mask
            return serialPort;
        } catch (SerialPortException ex) {
            ex.printStackTrace();
           // Utils.log(ex);
            return null;
        }
    }

    //将读取到的字节数组转换为字符串，检验合格后再转换成GPS数据信息，发送到前端显示
    //测试时先返回String
    //throws Exception
    public static String recvMsg(SerialPort serialPort) throws SerialPortException {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }).start();


        String string = "";
        String [] strings;
        String string1 = "";
       try {
            //读取到的字节数组
            byte[] bytes =  serialPort.readBytes();
            //清除读取到的字节？

           if(bytes != null){
               string = new String(bytes);
               //string = bytes.toString();

               //检验字符串是否符合规格
               if(checkMsg(string)){
                   //得到字符串数组
                   strings = string.split(",");

                   //将字符串数组的字符串拼接起来
//                   string1 = strings[0]+","+strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+
//                           strings[5]+","+strings[6]+","+strings[7]+","+strings[8]+","+strings[9]+",,,"+
//                           string.charAt(66)+string.charAt(67)+string.charAt(68)+string.charAt(69);

                   string1 = strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+strings[5]+","+
                           strings[6]+","+strings[7]+","+strings[8];

                 //  GPSInformation gpsInformation = new GPSInformation(string1);
                   GPSInformation gpsInformation = new GPSInformation();
                   gpsInformation = GPSInformationUtils.formInfo(gpsInformation,string1);


                 //  return string1;
                  return gpsInformation.toString();

           }
           Thread.sleep(1000);
            //将字节数组转换成字符串


                //通过string1构造GPS数据信息

                //发送到前端


            }
            //return string1;
//            else {
//                return null;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //检验字符串是否符合规格
    public  static boolean checkMsg(String string){
        String[] strings = string.split(",");
        String  head = strings[0];

        if(head.equals("$GNRMC") )
        {
                if(!(string.charAt(6) == ',') || !(string.charAt(17) == ',') || !(string.charAt(19) == ',')
                        || !(string.charAt(29) == ',') || !(string.charAt(31) == ',') || !(string.charAt(42) == ',')
                        || !(string.charAt(44) == ',') || !(string.charAt(50) == ',') || !(string.charAt(56) == ',')
                        || !(string.charAt(63) == ',') || !(string.charAt(64) == ',') || !(string.charAt(65) == ','))

            return false;
        }
        //else
            return true;
    }

    //展示串口信息（搜索可以用的串口？）
    //向前台发送串口信息
    public  static void showSerialInfo(SerialPort serialPort){
        serialPort.getPortName();

    }

    //打开串口
    public  static void openSerialPort(SerialPort serialPort){
        try {
            if(!serialPort.isOpened()){
                serialPort.openPort();
            }

        } catch (SerialPortException e) {
            e.printStackTrace();
        }
    }

    //关闭串口
    public static void closeSerial(SerialPort serialPort){
        try {
            if(serialPort != null || serialPort.isOpened()){
                serialPort.closePort();
            }

        } catch (SerialPortException e) {
            e.printStackTrace();
        }
    }



        public static SerialPort openSerialPort(String portName, int baudRate) throws SerialPortException {
            //String string1 = "";
            final SerialPort serialPort = new SerialPort(portName);//串口号;
            serialPort.openPort();
            serialPort.setParams(baudRate, 8, 1, 0);
            if (serialPort.isOpened()) {
                System.out.println("打开串口：" + serialPort.getPortName());
            }
            serialPort.addEventListener(new SerialPortEventListener() {

                public void serialEvent(SerialPortEvent serialPortEvent) {
                    //if (serialPortEvent.isRXCHAR()) {
                        try {
                            if (serialPortEvent.getEventValue() > 0) {
                               // byte[] bytes = serialPort.readBytes(serialPortEvent.getEventValue());//以16进制的方式读取串口返回数据
                               // byte[] bytes = serialPort.readBytes();
                                String string = serialPort.readString(serialPortEvent.getEventValue());
                             //   String string = new String(bytes);
                                if(string.length() > 65){
                                    if(checkMsg(string)){
                                        String[] strings = string.split(",");
                                        String string1 = strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+strings[5]+","+
                                                strings[6]+","+strings[7]+","+strings[8];
                                        System.out.println("串口：" + serialPortEvent.getPortName() + "，接收数据：" + serialPort.readHexString(serialPortEvent.getEventValue()));
                                    }
                                }else {
                                    System.out.println("字符串过短！");
                                }

                                //System.out.println("串口：" + serialPortEvent.getPortName() + "，接收数据：" + serialPort.readHexString(serialPortEvent.getEventValue()));
                            }
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                   // }
                }


            });
            return serialPort;
        }

//    public static class PortReader implements SerialPortEventListener {
//        public void serialEvent(SerialPortEvent event) {
//            if (event.isRXCHAR() && event.getEventValue() > 0) {
//                try {
//                    String data = serialPort.readString(event.getEventValue());
//                    System.out.println(String.valueOf(event.getEventValue())+ " " + data);
//                    dispatcher.processCOMMessage(data);
//                } catch (SerialPortException ex) {
//                    System.out.println(ex);
//                }
//            }
//        }
//    }

    }





