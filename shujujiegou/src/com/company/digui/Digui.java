package com.company.digui;

public class Digui {

    public static int sum(int [] arr){
        return sum(arr,0);


    }

    private static int sum(int[] arr,int l){
        if(l == arr.length){
            return 0;
        }//必须加上这个if判断，否则抛异常
        return arr[l] + sum(arr,l+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i =sum(arr);
        System.out.print(i);
    }
}
