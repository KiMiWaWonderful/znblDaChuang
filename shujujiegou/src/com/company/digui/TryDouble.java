package com.company.digui;

public class TryDouble {

    public static void main(String[] args) {
//        String s = "11017.8718";
//        double l = Double.parseDouble(s);
//        int ii = (int) (l/100);
//        double lngg = (l - ii*100)/60;
//        System.out.println(ii+lngg);
//      //  int i = Integer.parseInt(String.valueOf(l/100));
//        //System.out.println(ii);
//        //System.out.println(Integer.parseInt(l/100));
//        //System.out.println(Integer.parseInt(Double.parseDouble(s)/100));
//        double lng = 11017.8718;
//        double result = 110+17.8718/60;
//        System.out.println(result);


        String strRead = "id=541TM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS012ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMLEAVTM28C_HM68P_SMS011ppm_LS00000lx_WESunny_SSOOFF_SSTOFF_HTOFF_AROFF_PMHCI ";
        System.out.println(strRead.indexOf("="));

        for (int i = 0; i <strRead.length() ; i++) {
            if(strRead.charAt(i) == 'T'){
            }
        }

/// /        for (int i = 0; i <strRead.length() ; i++) {
//            if (strings[i].contains("id=")) {
//                char[] c = strings[i].toCharArray();
//                for (int j = 0; j < c.length; j++) {
//                    if (c[j] == 'T') {
//                        strings[i] = strings[i].substring(j, c.length);
//                    }
//                }
//            }
//        }
    }
}
