public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        String s = "00000lx";
        String ss = "076ppm";
        String temp1 = s.substring(0,s.length()-2);
        String temp2 = ss.substring(0,ss.length()-3);
        System.out.println(temp1);
        System.out.println(temp2);
        int ls = Integer.parseInt(temp1);
        int sms = Integer.parseInt(temp2);
        System.out.println(ls);
        System.out.println(sms);
        System.out.println(ls >= 1000);
//        int um = Integer.parseInt(s.substring(0,s.length()-2));
//        int umm = Integer.parseInt(s.substring(0,ss.length()-3));
//        System.out.println(um);
//        System.out.println(umm);
    }
}
