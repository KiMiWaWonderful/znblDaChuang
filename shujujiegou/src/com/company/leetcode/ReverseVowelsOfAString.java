package com.company.leetcode;

public class ReverseVowelsOfAString {

    static boolean[] isVowel = new boolean[123];
    static{
        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;
        isVowel['A'] = true;
        isVowel['E'] = true;
        isVowel['I'] = true;
        isVowel['O'] = true;
        isVowel['U'] = true;
    }

    public static String reverseVowels(String s) {

        int l = 0;
        int r = s.length()-1;
        s.toLowerCase();
        //char[] chars = s.toCharArray();
//        while (l != r) {
////            if((s.charAt(l) =='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u') &&
////                    (s.charAt(r) =='a'||s.charAt(r)=='e'||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u') ){
////                char c = s.charAt(l);
////                s.charAt(l) = s.charAt(r);
////                s.charAt(r) = c;
////            }
//
//            if ((chars[l] == 'a' || chars[l] == 'e' || chars[l] == 'i' || chars[l] == 'o' || chars[l] == 'u') &&
//                    (chars[r] == 'a' || chars[r] == 'e' || chars[r] == 'i' || chars[r] == 'o' || chars[r] == 'u')) {
//                char temp = chars[l];
//                chars[l] = chars[r];
//                chars[r] = temp;
//            } else {
//                l++;
//                r--;
//            }
//        }
//        return new String(chars);



        char[] chars = s.toCharArray();
        while (l != r){

             if(!isVowel[chars[l]]){
                 l++;
                // continue;
             }else if (!isVowel[chars[r]]){
                 r--;
                 //continue;
             }else {
                 char temp = chars[l];
                 chars[l] = chars[r];
                 chars[r] = temp;
                 l++;
                 r--;
             }



        }
        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
