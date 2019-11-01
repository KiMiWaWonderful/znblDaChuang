package com.company.lanqiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GouWuQuanXiaoFeiFangAn {

    static int[] temp;
    static List<int[]> lis = new ArrayList<>();

    public static void print(){
        for(int[] x : lis){
            for(int y : x){
                System.out.print(y +" ");
            }
            System.out.println();
        }
    }
    public static boolean compare(int[] t){
        if(temp == null){
            return false;
        }
        for (int i = 0; i <t.length ; i++) {
            if(t[i] != temp[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[] n, int[] t){
        int sum = 0;
        for (int i = 0; i <n.length ; i++) {
            sum = sum + t[i]*n[i];
        }
        if(sum == 1000){
            return true;
        }
        return false;
    }
   public static void f(int[]n,int[] b, int [] t,int count){

        if(count >= b.length){
            return;
        }
       for (int i = 0; i <=b[count] ; i++) {
           t[count] = i;
           f(n,b,t,count+1);
           if(!compare(t)){
               if(check(n,t)){
                   lis.add(Arrays.copyOf(t,t.length));
               }
           }
           temp = Arrays.copyOf(t,t.length);
       }

   }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入商品的种类数");
        int num = scan.nextInt();
        int[] n = new int[num]; // 保存商品价格
        int[] b = new int[num]; // 保存每个商品最多有几个
        for(int i=0;i<num;i++){
            n[i] = scan.nextInt();  // 输入每个商品价格
            b[i] = 1000/n[i];   // 记录每商品的个数
        }
        f(n,b,new int[num],0);
        if(lis.size()==0){  // 没有元素
            System.out.println(0);
        }else{
            System.out.println(lis.size()); // 元素个数
            print();    // 输出结果
        }


    }
}
