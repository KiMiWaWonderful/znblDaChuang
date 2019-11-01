package com.company.leetcode;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

      //  int index = 0;
        //String str = "";
//        for (int i = 0; i <s.length() ; i++) {
//            if((s.charAt(i) >'A' && s.charAt(i)<'Z') || (s.charAt(i) >'a' && s.charAt(i)<'z')){
//                s.charAt(index) = s.charAt(i);
//                index++;
//            }
//        }


        s = s.toLowerCase();
        int len = s.length();
        StringBuilder str = new StringBuilder(len);
        for (char c : s.toCharArray()) {
            if ((c > 'a' && c < 'z')) {
                str.append(c);

            }
        }

        return str.toString().equals(str.reverse().toString());

//            int l = 0;
////            int r = str.length() - 1;
////            while (l != r) {
////                if (str.charAt(l) == str.charAt(r)) {
////                    l++;
////                    r--;
////                }
////                return true;
////            }
////            return false;
        }



}
