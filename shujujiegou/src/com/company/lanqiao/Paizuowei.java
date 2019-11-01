package com.company.lanqiao;

public class Paizuowei {

    static int sum = 0;
    public static boolean check(char[] c){
        int count = 1;
        for (int i = 0; i < c.length-1; i++) {
            if(c[i] == c[i+1]){
                count++;
            }else {
                count = 1;

            }
            if(count >= 3){
                return true;
            }
        }
        return false;
    }

    public static void allSort(char[] c,int start,int end){
        if(start>= end){
            if(!check(c)){
                sum++;
            }
            return;
        }else {
            for (int i = start; i <= end ; i++) {
                char temp = c[i];
                c[i] = c[start];
                c[start] = temp;
                allSort(c,start+1,end);
                temp = c[i];
                c[i] = c[start];
                c[start] = temp;
               // allSort(c,start+1,end);
            }
            
        }
    }
    public static void main(String[] args) {
       // int[] n = new int[]{1,2,3,4,5};
//        String n = "12345";
//        String s = n.substring(1,n.length());
//        for (int i = 0; i <s.length()-1 ; i++) {
//            System.out.println(s.charAt(i));
//        }
//        System.out.println(s);

        char[] c = {'A','A','A','B','B','B','C','C','C'};
        allSort(c,0,c.length-1);    // 全排列
        System.out.println(sum);

    }
}
