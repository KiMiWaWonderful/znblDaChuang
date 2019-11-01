package com.example.utils;

import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class SerialPortThreadUtils extends Thread implements SerialPortEventListener {

    SerialPort serialPort;
    byte[] bytes;
    StringBuffer stringBuffer;
    //String string = "";
    //String[] strings;
    String string1 = "";

    @Override
    public void run() {

         serialPort = new SerialPort("com3");
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

            if (serialPort.isOpened()) {
                System.out.println("打开串口：" + serialPort.getPortName());
            }

            serialPort.addEventListener(this);
            //SerialPortThreadUtils.recvMsg(serialPort);
            Thread.sleep(50);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //将读取到的字节数组转换为字符串，检验合格后再转换成GPS数据信息，发送到前端显示
    //测试时先返回String
    //throws Exception
    public static void recvMsg(SerialPort serialPort) throws SerialPortException {

        try {
            //读取到的字节数组
            byte[] bytes =  serialPort.readBytes();
            //清除读取到的字节？

            if(bytes != null){
                String string = new String(bytes);
                System.out.println("string:"+string);
                //string = bytes.toString();

                //检验字符串是否符合规格
                if(checkMsg(string)){
                    //得到字符串数组
                    String [] strings = string.split(",");

                    //将字符串数组的字符串拼接起来
//                   string1 = strings[0]+","+strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+
//                           strings[5]+","+strings[6]+","+strings[7]+","+strings[8]+","+strings[9]+",,,"+
//                           string.charAt(66)+string.charAt(67)+string.charAt(68)+string.charAt(69);

                    String string1 = strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+strings[5]+","+
                            strings[6]+","+strings[7]+","+strings[8];

                    System.out.println(string1);

//                    //  GPSInformation gpsInformation = new GPSInformation(string1);
//                    GPSInformation gpsInformation = new GPSInformation();
//                    gpsInformation = GPSInformationUtils.formInfo(gpsInformation,string1);


                    //  return string1;
                   // return gpsInformation.toString();

                }
                Thread.sleep(50);
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
      //  return null;
    }

    //检验字符串是否符合规格
    public  static boolean checkMsg(String string){
        String[] strings = string.split(",");
        String  head = strings[0];

        if(head.equals("$GNRMC") )
        {
            String s = "$GNRMC,125557.800,V,0000.0000,N,00000.0000,E,000.0,000.0,280606";
            if(!(string.charAt(6) == ',') || !(string.charAt(17) == ',') || !(string.charAt(19) == ',')
                    || !(string.charAt(29) == ',') || !(string.charAt(31) == ',') )
            //|| !(string.charAt(42) == ','
               // || !(string.charAt(44) == ',') || !(string.charAt(50) == ',') || !(string.charAt(56) == ',')
                //|| !(string.charAt(63) == ',') || !(string.charAt(64) == ',') || !(string.charAt(65) == ',')

                return false;
        }else {
            return false;
        }
        //else
        return true;
    }

    public void serialEvent(SerialPortEvent event)
    {
        switch (event.getEventType())
        {
            case SerialPortEvent.CTS:
            case SerialPortEvent.DSR:
            case SerialPortEvent.ERR:
            case SerialPortEvent.RING:
            case SerialPortEvent.RLSD:
            case SerialPortEvent.RXFLAG:
            case SerialPortEvent.TXEMPTY:
                break;

            case SerialPortEvent.RXCHAR:
                try
                {
                    if (event.getEventValue() > 0) {
                        byte[] bytes = serialPort.readBytes();
                       String string = new String(bytes);
//                        stringBuffer.append(string);
//                        String s = stringBuffer.toString();
                        if(string.length() < 65){
                            //检验字符串是否符合规格
                            if(checkMsg(string)){
                                //得到字符串数组
                                String[] strings = (string).split(",");

                                //将字符串数组的字符串拼接起来
//                   string1 = strings[0]+","+strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+
//                           strings[5]+","+strings[6]+","+strings[7]+","+strings[8]+","+strings[9]+",,,"+
//                           string.charAt(66)+string.charAt(67)+string.charAt(68)+string.charAt(69);

                                string1 = strings[1]+","+strings[2]+","+strings[3]+","+strings[4]+","+strings[5]+","+
                                        strings[6]+","+strings[7]+","+strings[8];

                                //  GPSInformation gpsInformation = new GPSInformation(string1);
//                            GPSInformation gpsInformation = new GPSInformation();
//                            gpsInformation = GPSInformationUtils.formInfo(gpsInformation,string1);
                                System.out.println(string1);

                                Thread.sleep(50);


                                //  return string1;
                                //  return gpsInformation.toString();

                            }
                        }else {
                            System.out.println("字符串过长！");
                        }



                        // Check bytes count in the input buffer
                        // Read data, if 10 bytes available
//                        String newBytes = serialPort.readString(event.getEventValue());
//                        // sLogger.debug("received:{}", newBytes);
//                        mReadStrBuf.append(newBytes);

//                        int eol = 0;
//                        while ((eol = mReadStrBuf.indexOf(System.getProperty("line.separator"))) >= 0)
//                        {
//                            eol += 2;
//                            String newCallStr = mReadStrBuf.substring(0, eol);
//                            Forum700CallRecord record = new Forum700CallRecord(newCallStr);
//                            if (record.isValid())
//                            {
//                                // record.printRecord();
//                                printToFile(record.getFileRecord());
//                                writeToDb(record);
//                            }
//                            else
//                            {
//                                sLogger.info("Invalid record");
//                            }
//                            if (mReadStrBuf.length() == ++eol)
//                            {
//                                mReadStrBuf = new StringBuffer();
//                                break;
//                            }
//                            else
//                            {
//                                mReadStrBuf.delete(0, eol);
//                            }
//                        }

                    }
                }
                catch (Exception e)
                {
                   e.printStackTrace();
                    return;
                }
                break;
        }
    }
}
