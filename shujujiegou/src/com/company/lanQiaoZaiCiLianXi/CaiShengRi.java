package com.company.lanQiaoZaiCiLianXi;

public class CaiShengRi {

    public static void main(String[] args) {
        int year;
        int month = 6;
        int day;
        int sum;

        boolean flag = false;

        for (year = 1900; year < 2012  ; year++) {
            for (day = 1;day<=31;day++ ){
                    sum = year*10000 + 6*100 + day;
                if(sum % 2012 == 0 && sum % 3 == 0 && sum % 12 == 0 ){
                    flag = true;
                    System.out.println(sum);
                }
                //break;
            }
            if(flag == true){
                break;
            }
        }


//        for (int i = 0; i <3 ; i++) {
//            for (int j = 0; j <=0 ; j++) {
//                if(j == 0){
//                    break;
//                }
//            }
//        }
                
    }
}
