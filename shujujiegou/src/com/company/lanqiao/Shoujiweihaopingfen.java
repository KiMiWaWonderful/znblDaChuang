package com.company.lanqiao;

import java.util.Scanner;

public class Shoujiweihaopingfen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        while (n>0){
            String string = scanner.nextLine();
            if((string.charAt(0) - string.charAt(1) == 1)
                    &&
                    (string.charAt(1) - string.charAt(2) == 1)
                    &&
                    (string.charAt(2) - string.charAt(3) == 1)){
                    sum = sum +5;
            }
            if((string.charAt(0) - string.charAt(1) == -1)
                    &&
                    (string.charAt(1) - string.charAt(2) == -1)
                    &&
                    (string.charAt(2) - string.charAt(3) == -1)){
                sum = sum +5;
            }
            if(((string.charAt(0)==string.charAt(1))&&(string.charAt(1)==string.charAt(2)))){
                    sum = sum + 3;
            }
            if(((string.charAt(1)==string.charAt(2))&&(string.charAt(2)==string.charAt(3)))){
                sum = sum + 3;
            }
            if(((string.charAt(0) == string.charAt(1)) && (string.charAt(2) == string.charAt(3)))){
                    sum = sum + 1;
            }
            if(((string.charAt(0) == string.charAt(2)) && (string.charAt(1) == string.charAt(3)))){
                sum = sum + 1;
            }
            if(string.contains("6") ){
                sum = sum + 1;
            }
            if(string.contains("8")){
                sum = sum + 1;
            }
            if(string.contains("9")){
                sum = sum + 1;
            }
            System.out.println(sum);
            n--;
        }

    }
}
