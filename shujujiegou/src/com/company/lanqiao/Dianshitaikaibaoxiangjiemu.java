package com.company.lanqiao;

public class Dianshitaikaibaoxiangjiemu {

    public static void main(String[] args) {

        int i = (int) (Math.random() * 60);
        if (i < 5) {
            System.out.println("恭喜中了：iphone手机");
        }else if (i < 17) {
            System.out.println("恭喜中了：mp3");
        } else if (i < 47) {
            System.out.println("恭喜中了：洗衣粉");
        } else {
            System.out.println("恭喜中了：KFC优惠券");
        }


//        int p =(int)(Math.random()*60) ;
//        System.out.println(p ) ;
    }
}
