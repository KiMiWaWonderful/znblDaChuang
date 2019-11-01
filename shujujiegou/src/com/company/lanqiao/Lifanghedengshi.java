package com.company.lanqiao;

public class Lifanghedengshi {

    public static void main(String[] args) {
//        for (int a = 1; a < 30 ; a++) {
//            for (int b = 1; b < 30 ; b++) {
//                for (int c = 1; c < 30 ; c++) {
//                    for (int d = 1; d < 30 ; d++) {
//                        int left = (int) (Math.pow(a,3) + Math.pow(b,3));
//                        int right = (int) (Math.pow(c,3) + Math.pow(d,3));
//
//                        if(left == right){
//                            int [] n = new int[]{a,b,c,d};
//
//                            Set<Integer> set = new TreeSet<>();
//
////                            for (int i = 0; i <n.length ; i++) {
////                                System.out.print(n[i] + " ");
////                            }
//                            Arrays.sort(n);
//                            for (int i = 0; i <n.length ; i++) {
//                                System.out.print(n[i] + " ");
//                            }
//                            System.out.println();
//                        }
//
//                    }
//                }
//            }
//        }

        int []arr = new int[31];
        for(int i = 1; i <= 30; ++i){
            arr[i] = (int)i*i*i;
        }
        for(int a = 1 ; a <= 27; ++a){
            for(int b = a+1 ; b <= 28; ++b){
                for(int c = b+1 ; c <= 29; ++c){
                    for(int d = c+1 ; d<= 30; ++d){
                        if((arr[a] + arr[d])==(arr[b] + arr[c]))
                            System.out.println(a + "," + b + "," + c + "," + d);
                    }
                }
            }
        }

    }
}
