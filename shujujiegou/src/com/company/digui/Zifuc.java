package com.company.digui;

public class Zifuc {

    public static void main(String[] args) {
        String strRead = "id=541TM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS012ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMHCI ";

        boolean flag = true;
        for (int i = 0; i <strRead.length() ; i++) {
                if(strRead.charAt(i) == 'T'){
                    strRead = strRead.substring(i,strRead.length());
                    break;
                }
        }

        String [] strings = strRead.split("_");

        for (int i = 0; i <strings.length ; i++) {
            if(strings[i].contains("TM") && strings[i].contains("PM")){
                char[] chars = strings[i].toCharArray();
                for (int j = 0; j <chars.length ; j++) {
                    if(chars[j] == 'T'){
                        strings[i] = strings[i].substring(j+2, chars.length);
                        break;
                    }
                }
            }else if(strings[i].contains("TM")){
                strings[i] = strings[i].replace("TM", "");
            }
//            if(strings[i].contains("TM") ){
//                strings[i] = strings[i].replace("TM", "");
//            }else if(strings[i].contains("TM") && strings[i].contains("PM")){
//                char[] chars = strings[i].toCharArray();
//                for (int j = 0; j <chars.length ; j++) {
//                    if(chars[i] == 'M'){
//                        strings[i] = strings[i].substring(j, chars.length);
//                    }
//                }
//            }
        }
        for (int i = 0; i <strings.length ; i++) {
            System.out.print(strings[i] +" ");
        }
        System.out.println();
        System.out.println(strRead);
    }
}
