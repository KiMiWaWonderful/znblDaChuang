package com.company.lanqiao;

import java.util.Scanner;

public class QuMaChengZhong {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[]{-1,0,1};
        for(int i:data){
            for(int j:data){
                for(int k: data){
                    for(int l:data){
                        for(int m:data){
                            int a = i*1;
                            int b = j*3;
                            int c = k * 9;
                            int d = l * 27;
                            int e = m * 81;
                            if(a+b+c+d+e == n){
                                stringBuffer.append(e!=0?(e>0?"+" + e: String.valueOf(e)):"");
                                stringBuffer.append(d!=0?(d>0?"+" + d: String.valueOf(d)):"");
                                stringBuffer.append(c!=0?(c>0?"+" + c: String.valueOf(c)):"");
                                stringBuffer.append(b!=0?(b>0?"+" + b: String.valueOf(b)):"");
                                stringBuffer.append(a!=0?(a>0?"+" + a: String.valueOf(a)):"");
                                stringBuffer.deleteCharAt(0);
                                System.out.println(stringBuffer.toString());
                            }
                        }
                    }
                }
            }
        }

    }
}
