package com.company.server;

import java.util.Calendar;

public class TryDate {



    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year  = calendar.getWeekYear();
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year + "/" + month + "/" + date +" " + hour + ":" +minute + ":" + second);
    }
}
