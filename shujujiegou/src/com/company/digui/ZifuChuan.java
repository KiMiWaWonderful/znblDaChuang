package com.company.digui;

public class ZifuChuan {

    public static void main(String[] args) {
       String string="$GNRMC,125557.800,V,0000.0000,N,00000.0000,E,000.0,000.0,280606,,,N*6B";
        System.out.println("string的长度："+string.length());
//        int index = 0;
//        int index2 = 0;
//        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println(string.length());
//        System.out.println(string.substring(0,70));
//
        String[] strings = string.split(",");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println("i:"+i+" "+strings[i]);
        }
        System.out.println();
//        System.out.println(stringBuffer.toString());

        String s = "$GNRMC,125557.800,V,0000.0000,N,00000.0000,E,000.0,000.0,280606";
        System.out.println(s.length());

        String ss = "3.141592653";

        String sss = "104.091194";

//        double value = Double.valueOf(ss);
        double value = Double.parseDouble(sss.toString());

        //纬度的度
        //double d = value/100.0;
        int dd = (int) (value/100.0);
        //纬度的分
       double lati_cent_tmp = (value - dd* 100.0);
        int lati = ((int)lati_cent_tmp);

        //纬度的秒
       double lati_second_tmp = (lati_cent_tmp - lati )* 60.0;
        int latisec = ((int)lati_second_tmp);

        double du = dd + (lati+latisec/60.0)/60.0;
//        double dd = valuew/100;
//        int i = (int)d;
        System.out.println(value);
        System.out.println(dd);
        System.out.println(lati);
        System.out.println(latisec);
        System.out.println(du);
//        System.out.println(dd);
//        System.out.println(i);
//        float value1 = Float.valueOf(ss);

        //纬度
//        BigDecimal bigDecimal = new BigDecimal(sss);
//
//        //纬度的度
//        BigDecimal bigDecimal1 = bigDecimal.divide(new BigDecimal(100));
////        int i = Integer.parseInt(String.valueOf(bigDecimal1));
//
//        BigDecimal temp = bigDecimal.multiply(new BigDecimal(100));
//        BigDecimal lati_cent_tmp = bigDecimal.subtract(temp);
//        System.out.println(Integer.parseInt(String.valueOf(lati_cent_tmp)));

//        BigDecimal bigDecimal1 = new BigDecimal(sss).setScale(4,BigDecimal.ROUND_CEILING);
//        System.out.println(bigDecimal1);
//        System.out.println(bigDecimal);
//        System.out.println(bigDecimal1);
     //   System.out.println(i);

        //不可用
//        BigDecimal bigDecimal1 = BigDecimal.valueOf(0000.0000);
//        System.out.println(bigDecimal1);
//        double value2 = bigDecimal.doubleValue();
//        System.out.println(value2);

//        String s = "0000.0000";
//
//        DecimalFormat decimalFormat = new DecimalFormat();



       // System.out.println(new DecimalFormat("0000.0000").format(s.toString()));

//        System.out.println(0.5*3);
//        System.out.println(0.1*3);

        // BigDecimal temp = BigDecimal.valueOf(s);
// 将temp乘以100
//        temp = temp.multiply(BigDecimal.valueOf(100));
//        int sum = temp.intValue();
//        System.out.println(sum);
       // System.out.println(temp);



        //System.out.println(string.substring(5,));

//        for (int i = 0; i <string.length() ; i++) {
//            boolean flag = false;
//            if(string.charAt(i) == ','){
//                index = i;
//            }
//            if(string.charAt(i) == ''){
//                index2 = i;
//            }
//        }
    }
}
