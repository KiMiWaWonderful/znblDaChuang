package com.company.lanqiao;

public class Diguisuanfa {

    public static void allSort(int[] data,int n){
        if(n == data.length){
            for (int i = 0; i <data.length ; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
            return;
        }
            for (int i = n; i <data.length ; i++) {
                int temp = data[n];
                data[n] = data[i];
                data[i] = temp;

                allSort(data,n+1);


                int tem = data[n];
                data[n] = data[i];
                data[i] = tem;
            }
        }
       // int k = data.length - 1;

    public static void perm(int[] buf,int start,int end){
        if(start==end){//当只要求对数组中一个字母进行全排列时，只要按该数组输出即可
            for(int i=0;i<=end;i++){
                System.out.print(buf[i]);
            }
            System.out.println();
        }
        else{//多个字母全排列
            for(int i=start;i<=end;i++){
                int temp=buf[start];//交换数组第一个元素与后续的元素
                buf[start]=buf[i];
                buf[i]=temp;
                perm(buf,start+1,end);//后续元素递归全排列
                temp=buf[start];//将交换后的数组还原
                buf[start]=buf[i];
                buf[i]=temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] data = new int[]{0,1,2};
       // System.out.println(data.length);
        //perm(data,0,data.length-1);
        allSort(data,0);


    }
}
