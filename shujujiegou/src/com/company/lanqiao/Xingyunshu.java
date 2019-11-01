package com.company.lanqiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Xingyunshu {

    public static void xingyun(List<Integer> list, int t){
//        if ( m >= n){
//            System.out.println(list.size());
////            for (int i = 0; i <list.size() ; i++) {
////                System.out.print(list.get(i) + " ");
////            }
//            return;
//        }

        if(t >= list.size()){
            System.out.println(list.size());
            return;
        }
//        for (int i = 1; i <list.size() ; i++) {
//            int p =list.get(t);
//            if(i % p == 0){
//                list.remove(list.get(i));
//            }
//        }

        for(int i=list.size()-1;i>=1;i--){
            if(i%2==0){
                list.remove(i);
            }
        }
        for (int i = list.size()-1; i >=1 ; i--) {
            if(i%list.get(t)==0){
                list.remove(list.get(i));
            }
        }
        t ++;

        xingyun(list,t);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int t = 2;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = m+1; i <=n-1 ; i++) {
            list.add(i);
        }
        xingyun(list,t);
//        System.out.println(m);
//        System.out.println(n);
//        System.out.println(list.size());
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }

//        Vector<Integer> vector=new Vector<Integer>();
//        int m,n;
//        Scanner scanner=new Scanner(System.in);
//        m=scanner.nextInt();
//        n=scanner.nextInt();
//        for(int i=0;i<=n;i++){
//            vector.add(i);
//        }
//        //除掉序号能被2整除的
//        for(int i=vector.size()-1;i>=1;i--){
//            if(i%2==0){
//                vector.remove(i);
//            }
//        }
//        int index=2;
//        while(index<vector.size()){
//            for (int i = vector.size()-1; i>=1; i--) {
//                if(i%vector.elementAt(index)==0){
//                    vector.remove(i);
//                }
//            }
//            index++;
//        }
//        int count=0;
//        for(int i=vector.size()-1;i>=1;i--){
//            if(vector.elementAt(i)==n){
//                continue;
//            }
//            else if(vector.elementAt(i)>m){
//                count++;
//            }else {
//                break;
//            }
//        }
//        System.out.println(count);


    }
}
