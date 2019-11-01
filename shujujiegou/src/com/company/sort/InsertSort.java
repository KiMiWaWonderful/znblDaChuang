package com.company.sort;

public class InsertSort {

    public static void main(String[] args) {
        int a[] = new int[]{2,4,5,6,9,88,58,100};
        System.out.println("未排序前：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        InsertSort(a);
        System.out.println("排序后：");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }

    public static void InsertSort(int a[]){
        for (int i = 1; i <a.length ; i++) {
            int temp = a[i];
            int j;
            for (j = i-1; j >=0 ; j--) {
                if(a[j]>temp){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = temp;
        }
       // return a[];
    }
}
