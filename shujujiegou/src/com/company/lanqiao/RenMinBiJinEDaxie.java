package com.company.lanqiao;

import java.util.Scanner;

public class RenMinBiJinEDaxie {
    static char[] uper = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'}; // 大写数字
    static char[] unit = {' ','拾','佰','仟','万','拾','佰','仟','亿','拾','佰'}; // 单位

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        int num0 = 0;
        for (int i = string.length()-1; i >=0 ; i--) {
            if(string.charAt(i) != '0'){
                stringBuffer.insert(0,unit[string.length()-1-i]);
            }
            if(string.length()-1-i == 4){
                stringBuffer.insert(0,'万');
            }
            if(string.charAt(i) == '0'){
                num0++;
            }else {
                num0 = 0;
            }
            if(num0<=1){
                stringBuffer.insert(0,uper[string.charAt(i)-'0']);
            }
        }
        if(stringBuffer.charAt(stringBuffer.length()-1) == '零'){
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        String ss = stringBuffer.toString();
        ss = ss.replace("零万","万");
        ss = ss.replace("亿万","亿");
        ss = ss.replace("万万","万");
        System.out.println(ss);


    }
}
