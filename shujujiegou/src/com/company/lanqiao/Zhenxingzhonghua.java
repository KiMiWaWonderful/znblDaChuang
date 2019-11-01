package com.company.lanqiao;

public class Zhenxingzhonghua {

    public  static int zhenxing(String[][] string1,int x, int y, String[] string,int index){
       // int count = 0;

        if(x <= 3 && y <=4){
            if(string1[x][y] == string[index]){
                if(string[index] == "华"){
                    return 1;
                }else {
                 //   return zhenxing(string1,x,y+1,string,index+1) + (string1,x+1,y,string,index+1);

                    return zhenxing(string1,x,y+1,string,index+1)
                            +
                            zhenxing(string1,x+1,y,string,index+1);

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        String indexsString[] = { "从", "我", "做", "起", "振", "兴", "中", "华" };
        String[][] string1 = new String[][]{
                { "从", "我", "做", "起", "振" },
                { "我", "做", "起", "振", "兴" },
                { "做", "起", "振", "兴", "中" },
                { "起", "振", "兴", "中", "华" }
        };

        System.out.println(zhenxing(string1,0,0,indexsString,0));


    }
}
