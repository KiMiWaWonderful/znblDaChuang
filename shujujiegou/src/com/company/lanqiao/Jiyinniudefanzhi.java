package com.company.lanqiao;

import java.util.ArrayList;

public class Jiyinniudefanzhi {

    class Cow{
        private int age;

        public Cow panduan(){
            age ++ ;
            if(age>2){
                return new Cow();
            }else {
                return null;
            }
        }

        public  void show(int n){
            ArrayList<Cow> list = new ArrayList<Cow>();
            list.add(new Cow());
            for (int i = 0; i <n ; i++) {
                int cowCount = list.size();
                for (int j = 0; j <cowCount ; j++) {
                    Cow cow = list.get(i).panduan();
                    if(cow!=null){
                        cow.panduan();
                        list.add(cow);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {



    }
}
