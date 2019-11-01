package com.company.sort;

public class ShellSort {

    public static void main(String[] args) {
        int a[] = new int[]{2,4,5,6,101,290,9,88,58,100};
        System.out.println("未排序前：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        ShellSort(a);
        System.out.println("排序后：");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
    }

    public static void ShellSort(int []a){
        int d = a.length/2;
        while (true){
            for (int i = 0; i <a.length ; i++) {
                for (int j = i; j +d<a.length ; j+=d) {
                    int temp;
                    if(a[j]>a[j+d]){
                       temp = a[j];
                       a[j] = a[j+d];
                       a[j+d] = temp;
                    }
                }
            }
            if(d == 1){
                break;
            }
            d--;
        }
    }
}
