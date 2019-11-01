package com.company.lanqiao;

public class Caishengri {

    public static void main(String[] args) {
        String str = null;
        for (int i = 19000101; i <20120312 ; i++) {
            String string = ""+i;

            int year = Integer.parseInt(string.substring(0,4));
            int month = Integer.parseInt(string.substring(4,6));
            int day = Integer.parseInt(string.substring(6,8));

            if(month != 6){
                continue;
            }
            //不可以写20120312%i
            if((!(i%2012 == 0 && i%3 == 0 && i%12 == 0))){
                continue;
            }
            if(day == 0 || day > 31){
                continue;
            }
            System.out.println(string);
            break;

           // str = string;

        }
      //  System.out.println(str);


    }
}
