package com.company.lanqiao;

public class Fangzhenshunshizhenxuanzhuan {

    public static void zhuanhuan(int[][]n, int[][] m, int i, int j){
        int t = j;
        if(i >= n.length){
            return;
        }
        for (int k = 0; k <n.length ; k++) {
            //while (j>=0){
                m[i][k] = n[j][i];
                j--;
          //  }


        }
        i = i + 1;
        zhuanhuan(n,m,i,t);
       // return m;
    }
    public static void main(String[] args) {

        int[][] n = {
                {1 ,2 ,3 ,4 },
                {5 ,6 ,7 ,8 },
                {9 ,10,11,12},
                {13,14,15,16}
        };
        int[][] m = new int[n.length][n.length];
        zhuanhuan(n,m,0,n.length-1);
        for (int i = 0; i <m.length ; i++) {
            for (int j = 0; j <m.length ; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    //将矩阵转了180度
//    public static void main(String[] args) {
//        int[][] n = {
//                {1 ,2 ,3 ,4 },
//                {5 ,6 ,7 ,8 },
//                {9 ,10,11,12},
//                {13,14,15,16}
//        };
//
////        Scanner scanner = new Scanner(System.in);
////        int n = scanner.nextInt();
////        int [][] data = new int[n][n];
//        Stack<Integer> stack = new Stack<Integer>();
//
//        for (int i = 0; i <n.length ; i++) {
//            for (int j = 0; j <n.length ; j++) {
//                stack.push(n[i][j]);
//            }
//        }
//
//        int[][] temp = new int[4][4];
//        for (int i = 0; i <temp.length ; i++) {
//            for (int j = 0; j <temp.length ; j++) {
//                temp[i][j] = stack.pop();
//            }
//        }
//
//        for (int i = 0; i <temp.length ; i++) {
//            for (int j = 0; j <temp.length ; j++) {
//                System.out.print(temp[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
