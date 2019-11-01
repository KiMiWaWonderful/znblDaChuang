package com.company.lanqiao;

public class Gudaiduju {

    public static void main(String[] args) {
        //Math.random()返回带正号的double值，该值大于等于0.0且小于1.0，即取值范围是[0.0,1.0)的左闭右开区间
        //(int) (Math.random())这个结果为0，因为先执行了强制转换
        //Math.random()*6生成0到6的随机数

        int sum = 0;
       // int n = 1;

        for (int i = 1; i < 500000; i++) {
            int a = (int) (Math.random()*6+1);
            int b = (int) (Math.random()*6+1);
            int c = (int) (Math.random()*6+1);
            int d = (int) (Math.random()*6+1);

            if((a == d) && (b == d) && (c == d)){
                sum = sum -6;
            }
            else if((a == d) || (b == d) || (c == d)){
                sum = sum - 1;
            }
            else if((d == a && d == b && d != c)|| (d == b && d == c && d != a) || (d == a && d == c && d != b)){
            //else if((a==b&&a==c)||(a==c&&a==d)||(a==b&&a==d)){
                sum = sum - 2;
            }
            else if((a * d == b * c) || (a * b == c * d) || (b * d == a * c)){
                //continue;
                sum = sum + 0;
            }
            else {
                sum = sum +1;
            }
        }
        double d = sum/500000f;
        System.out.println(d);
        System.out.printf("%.3f",d);

//        int a,b,c,d,sum = 0;
//        for (int i = 0; i < 500000; i++) {
//            a=(int) (Math.random()*6)+1;
//            b=(int) (Math.random()*6)+1;
//            c=(int) (Math.random()*6)+1;
//            d=(int) (Math.random()*6)+1;
//            //	System.out.println(a+"  "+b+"  "+c+"  "+d);
//            if(a==b&&a==c&&a==d){
//                sum-=6;
//            }else if((a==b&&a==c)||(a==c&&a==d)||(a==b&&a==d)){
//                sum-=2;
//            }else if(a==b||a==c||a==d){
//                sum-=1;
//            }else if ((a*b==c*d)||(a*c==b*d)||(a*d==b*c)) {
//                sum-=0;
//            }else {
//                sum+=1;
//            }
//        }
//        System.out.printf("%.3f",sum/500000f);



//        int a = (int) (Math.random()*6 + 1);
//        int b = (int) Math.random();
//        double c = Math.random();
//        double d = Math.random()*6 + 1;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);



//            int all=500000;
//            Random r=new Random();
//            int na=0;
//            int nb=0;
//            int nc=0;
//            int nd=0;
//            for(int y=0;y<all;y++){
//                int s1=r.nextInt(6)+1;
//                int s2=r.nextInt(6)+1;
//                int s3=r.nextInt(6)+1;
//                int s4=r.nextInt(6)+1;
//                if((s1==s2&&s1!=s3&&s1!=s4)||(s1!=s2&&s1==s3&&s1!=s4)||(s1!=s2&&s1!=s3&&s1==s4)){
//                    na++;
//                    continue;
//                }else if((s1==s2&&s1==s3&&s1!=s4)||(s1==s2&&s1!=s3&&s1==s4)||(s1!=s2&&s1==s3&&s1==s4)){
//                    nb++;
//                    continue;
//                }else if(s1==s2&&s1==s3&&s1==s4){
//                    nc++;
//                    continue;
//                }else if(s1*s2==s3*s4||s1*s3==s2*s4||s1*s4==s2*s3){
//                    nd++;
//                }
//
//            }
//            System.out.println("na:"+na+"  nb:"+nb+" nc:"+nc+" nd:"+nd);
        }
    }




