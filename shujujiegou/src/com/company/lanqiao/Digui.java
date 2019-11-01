package com.company.lanqiao;

public class Digui {

   static void f(int n){
        if(n>=0){
            System.out.println(n);
            f(n-1);
           // System.out.println(n);
        }
    }

    static void f2(int n1,int n2){

       if(n1>n2)
           return;
           // if(n2 - n1 > 0) {
                System.out.println(n1);
                f2(n1+1, n2);
                //不可以是n++
           // }

    }

    static int addAll(int[] a){
       int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum = sum+a[i];
        }
        return sum;
    }

    static int addAll2(int begin,int[] a){
       //不可以在递归中定义sum = 0,这样在每一次递归调用时sum都会重新变成0
      // int sum = 0;
       if(a.length == begin){
           return 0;
       }
       //if(a.length > begin){
           //sum = sum + a[begin];
          int sum =  addAll2(begin+1,a);
       return sum + a[begin];
      // }

//       if(n<=a.length){
//           sum = sum + a[n];
//           addAll2(n-1,a);
//       }
      // return sum;
    }

    static boolean isSameString(String s1,String s2){
       if(s1.length() != s2.length()){
           return false;
       }

       //&& s2.length() == 0
       if(s1.length() == 0 ){
           return true;
       }

       //这个if判断要放在上一个的后面
        if(s1.charAt(0) != s2.charAt(0)){
            return false;
        }
       return isSameString(s1.substring(1),s2.substring(1));
    }

    static int quqiu(int n,int m){
       if(m==0){
           return 1;
       }
       if(n<m){
           return 0;
       }
       if(n==m){
           return 1;
       }
       return quqiu(n-1,m) + quqiu(n-1,m-1);
    }

    //k为当前交换位置（关注点），与其后面的元素交换
    static void quanpailie(char[] data ,int k){

       if(k == data.length){
           for (int i = 0; i < data.length; i++) {
               System.out.print(data[i] + " ");

           }
           System.out.println();
       }
        for (int i = k; i <data.length ; i++) {
            {//试探
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            }

            quanpailie(data,k+1);

            {//回溯
                char t = data[k];
                data[k] = data[i];
                data[i] = t;
            }
        }

//        for (int i = k; i <data.length ; i++) {
//
//        }
    }

    static int qiuzuidazixulie(String s1, String s2){
       if(s1.length() == 0 || s2.length() == 0){
           return 0;
       }
       if(s1.charAt(0) == s2.charAt(0)){
           return qiuzuidazixulie(s1.substring(1),s2.substring(1))+1;
       }
       return Math.max(qiuzuidazixulie(s1.substring(1),s2),qiuzuidazixulie(s1,s2.substring(1)));
    }

    static String reverseString(String s){
       if(s.length() == 0 || s.length() <2){
           return s;
       }
       return reverseString(s.substring(1))+s.charAt(0);
    }

    static int yanghuisanjiao(int m,int n){
       if(m ==0 || n== 0){
           return 1;
       }
       return yanghuisanjiao(m-1,n)+yanghuisanjiao(m-1,n-1);
    }

    static int pailiezuhe(int m,int n){
       if(m == 0 || n == 0){
           return 1;
       }
       return pailiezuhe(m-1,n)+pailiezuhe(m,n-1);
    }

    static void huafen(int n , int[] a, int k){

       if(n <= 0){
           for (int i = 0; i <k ; i++) {
               System.out.print(a[i] + "+");
           }
           System.out.println();
       }
        for (int i = n; i >0 ; i--) {
           if(k>0 && i>a[k-1])
               continue;
            a[k] = i;
            huafen(n-i,a,k+1);
        }
    }

    static void maiyinliao(){
        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j <100 ; j++) {
                if(i*2.3 + j * 1.9 == 82.3){
                    System.out.println(i + "," + j);
                }
                
            }
        }
    }

    static void haidao(){
        for (int a = 20; a >=1 ; a--) {
            for (int b = a-1; b >=1 ; b--) {
                for (int c = b-1; c >=1 ; c--) {
                    for (int d = c-1; d >=1 ; d--) {
                        if((1.0/a + 1.0/b + 1.0/c + 1.0/d) == 1.0 ){
                            System.out.println(a + " " + b + " "+ c + " " + d);
                        }
                    }
                }
            }
        }
    }

    //辗转相除法
    static int gcd(int a , int b){
       if(a == 0){
           return b;
       }
       return gcd(b%a,a);
    }

    static int mi(int a,int b){
       int x = 1;
        for (int i = 0; i <b ; i++) {
            x = x*a;
        }
        return x;
    }
    public static void main(String[] args) {

        System.out.println(mi(1000000,3));
        //System.out.println(3/0);
      // haidao();
               // f(10);
        //f2(0,10);
//        int [] a = {1,2,3,4};
//        int sum = addAll2(0,a);
//        System.out.println(sum);
//        String s1 = "";
//        String s2 = "";
////        System.out.println(s1.equals(s2));
////        System.out.println(s1.substring(1));
////        System.out.println(s1.charAt(0));
//        System.out.println(isSameString(s1,s2));
        //System.out.println(quqiu(5,3));


        //char [] data = "abcde".toCharArray();
        //quanpailie(data,0);
        //System.out.println(data.length);

       // System.out.println(qiuzuidazixulie("abc","abcd"));

      //  System.out.println(reverseString("abbbbcfybc"));

       // System.out.println(yanghuisanjiao(2,3));
        
//        int level = 5;
//        for (int i = 0; i <=level ; i++) {
//            System.out.print(yanghuisanjiao(level,i) + " ");
//
//        }
//        System.out.println();

      //  System.out.println(pailiezuhe(3,2));

//        int [] a = new int[1000];
//        huafen(5,a,0);

        //maiyinliao();

//        int a = 5;
//        int b = 40;
//        if(a == 0){
//            System.out.println();
//        }
//        for (; ; ) {
//            if(a == 0){
//                System.out.println(b);
//                break;
//            }
//            int t = a;
//            a = b%a;
//            b = t;
//        }

       // System.out.println(gcd(40,5));
   }
}

