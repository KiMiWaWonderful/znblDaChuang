package com.example.demo;

import com.example.utils.SerialPortManager;

import java.util.ArrayList;

public class SerialPortTest {

    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = SerialPortManager.findPorts();
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print(arrayList.get(i) +" ");
        }
       // SerialPort serialPort1 = SerialPortManager.openPort("COM4",115200);
//        SerialPort serialPort2 = SerialPortManager.openPort("COM6",115200);
//        SerialPortManager.sendToPort(serialPort2,"heg");
//        serialPort2.close();
//         SerialPortManager.sendToPort(serialPort1,"open the door");
//         SerialPortManager.receiveFromPort(serialPort2);

//        SerialPortThreadUtils serialPortThreadUtils = new SerialPortThreadUtils();
//        serialPortThreadUtils.start();

       // SerialPort serialPort = SerialPortManager.openPort()
       // SerialPortManager
//        final SerialPort serialPort = SerialUtils.constructPort("com3");
//        SerialUtils.openSerialPort(serialPort);
//        System.out.println(SerialUtils.recvMsg(serialPort));

//        String string = "$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706";
//        GPSInformation gpsInformation = new GPSInformation();
//        gpsInformation = GPSInformationUtils.formInfo(gpsInformation,string);
//        System.out.println(gpsInformation.toString());
//        double[] doubles = BaiDuMapLoacationUtils.get_location(gpsInformation.getLat(),gpsInformation.getLng());
//        for (int i = 0; i < doubles.length; i++) {
//            System.out.print(doubles[i] +" ");
//        }
//        System.out.println();
//        Map<String,Double> map = new HashMap<>();
//        map.put("latitude",doubles[0]);//纬度
//        map.put("longitude",doubles[1]);//经度
//
//        JSONArray jsonArray = JSONArray.fromObject(map);
//        System.out.println(jsonArray);
//        System.out.println(jsonArray.toString());
//
//        double GPS_lat = gpsInformation.getLat();
//        double GPS_lon = gpsInformation.getLng();
//        double[] doubles = BaiDuMapLoacationUtils.get_location(GPS_lat,GPS_lon);
//        if(doubles != null){
//            for (int i = 0; i < doubles.length; i++) {
//                System.out.print(doubles[i] +" ");
//            }
//        }else {
//            System.out.println("为空");
//        }


      //SerialPort serialPort1 = SerialUtils.openSerialPort("com3",115200);

//        ArrayList<String> portList = SerialPortManager.findPorts();
//        System.out.print(portList.get(0) +" ");
//        for (int i = 0; i <portList.size() ; i++) {
//
//        }
//        SerialPort serialPort = SerialPortManager.openPort("COM3",115200);
//        SerialPortManager.readFromPort(serialPort);
//        String string = new String(bytes);
//        System.out.println(string);
        //System.out.println(SerialPortManager.checkMsg(string));


     //   SerialPortManager.openPort(serialPort,)

//        String string = "";
//        String [] strings;
//        String [] strings1;
//        List<String> list = new ArrayList<>();
//        String string1 = "";

//        while (true){
//            System.out.println(SerialUtils.recvMsg(serialPort));
//        }

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println(SerialUtils.recvMsg(serialPort));
//
//                } catch (SerialPortException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();



//        while (true){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        System.out.println(SerialUtils.recvMsg(serialPort));
//                        Thread.sleep(1000);
//                    } catch (SerialPortException e) {
//                        e.printStackTrace();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//
//        }

//        while (true){
//            byte[] bytes =  serialPort.readBytes();
//            //清除读取到的字节？
//
//            if(bytes != null) {
//                string = new String(bytes);
//
//                // && string.endsWith("\r\n")
//                if(string.startsWith("$GNRMC")&& string.endsWith("\r\n")){
//                    strings = string.split(",");
//                    for (int i = 1,j=0; i<9;i++){
//                        list.set(j,strings[i]);
//                        j++;
//
////                        if(i == 1){
////                           // strings1[0] = strings[i];
////                          list.set(0,strings[i]);
////                        }
////                        if(i == 2){
////                            list.set(1,strings[i]);
////                        }
////                        if(i == 2){
////                            list.set(1,strings[i]);
////                        }
//
//                    }
//
//                }
//                System.out.println("这是string:"+string);
//                for (int i = 0; i<list.size();i++){
//                    System.out.print("这是list:"+list.get(i) +" ");
//                }
//            }
//        }

      //  System.out.println(SerialUtils.recvMsg(serialPort));

//        try {
//            SerialPort serialPort = RxtxSerialPortUtils.openPort("com6",115200);
//        } catch (PortInUseException e) {
//            e.printStackTrace();
//        }

    }
}
