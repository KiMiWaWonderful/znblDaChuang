package com.company.lanqiao;

public class NJinZhiXiaoShu {

    public static void fun(double dTestNo, int iBase) {
        int[] iT = new int[8];
        int iNo;
        System.out.printf("十进制正小数 %f 转换成 %d 进制数为: ", dTestNo, iBase);
        for (iNo = 0; iNo < 8; iNo++) {
            dTestNo *= iBase;
            iT[iNo] = (int)dTestNo ; // 填空
            if(dTestNo>=1.0)
                dTestNo -= iT[iNo]; // 填空
        }
        System.out.printf("0.");
        for (iNo = 0; iNo < 8; iNo++)
            System.out.printf("%d", iT[iNo]);
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        double dTestNo = 0.795;
        int iBase;
        for (iBase = 2; iBase <= 9; iBase++)
            fun(dTestNo, iBase);
        System.out.printf("\n");

//        System.out.println(0%6);
//        System.out.println(0/6);
    }

}
