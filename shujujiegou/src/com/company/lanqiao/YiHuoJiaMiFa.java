package com.company.lanqiao;

public class YiHuoJiaMiFa {

    public static void print(char[] p){
        for(char x:p){
            System.out.printf("%s", x);
        }
        System.out.println();
    }
    public static void f(char[] buf, char[] uckey, int n) {
        int i;
        for (i = 0; i < n; i++)
            buf[i] = (char) (buf[i] ^ uckey[i]);
    }

    public static void main(String[] args) {
        char p[] = "abcd中国人123".toCharArray(); // 待加密串
        char[] key = "11001100010001110".toCharArray(); // 以串的形式表达的密匙，运算时要转换为按位存储的形式。
        int np = p.length;
        int nk = key.length;
        char[] uckey = new char[np];

        // 密匙串需要按位的形式循环拼入 uckey中
        int i;
        for (i = 0; i < np * 8; i++) {
            if (key[i % nk] == '1')
                uckey[i/8] |= (char)0x80 >> (i%8);
                // 填空1
            else
                uckey[i/8] &= ~(char)0x80 >> (i%8); // 填空2
        }
        f(p, uckey, p.length);
        print(p);
        f(p, uckey, p.length);
        print(p);
    }

}
