package com.company.lanqiao;

import java.util.Calendar;
import java.util.Date;

public class Shijimodexingqi {

    public static void main(String[] args) {

        int year = 2000;
        int total = 0;
        for (;  ; year++) {
            if(year % 400 == 0 || (year%4 == 0 && year % 100 != 0)){
                total = total + 366;
            }else {
                total = total + 365;
            }

            if((total + 5) % 7 == 0 && (year % 100 == 99) ){
                System.out.println(year);
                break;
            }
        }

        Calendar calendar = Calendar.getInstance();
        for (int i = 1999; ; i+=100) {
            calendar.setTime(new Date(i - 1900,11,31));
            if(calendar.get(Calendar.DAY_OF_WEEK) == 1){
                System.out.println(i);
                break;
            }

        }
      //  calendar.set(1999,12,31);


//        int day=0;
//        for (int year = 2000; ; year++) {
//            day+=dayOfyear(year);
//            if(year%100==99&&day%7==2){
//                System.out.println(year);
//                break;
//            }
//        }


    }

    private static int dayOfyear(int year) {
        if ((year%4==0&&year%100!=0)||year%400==0) {
            return 366;
        }
        else {
            return 365;
        }
    }
}
