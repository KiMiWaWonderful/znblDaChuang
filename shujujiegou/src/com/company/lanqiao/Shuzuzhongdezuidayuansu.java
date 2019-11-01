package com.company.lanqiao;

public class Shuzuzhongdezuidayuansu {
    public static void main(String[] args) {
        int array[]={0,34,67,90,21,-9,98,1000,-78};
        System.out.println(new Shuzuzhongdezuidayuansu().findMax (array, 0));
    }
    public int findMax(int array[],int index)
    {
        if(array==null || array.length==0)
        {
            return 0;
        }
        int max=array[0];
        while(index<array.length-1)
        {
            max= max>array[++index] ? max : array[++index];
        }
        if(max<array[index])
            max= array[index];
        return max;
    }

}
