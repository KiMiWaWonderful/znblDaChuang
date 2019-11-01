package com.company.sort;

public class BinaryInsert {

    public static void main(String[] args) {
        int a[] = new int[]{2,4,5,6,101,290,9,88,58,100};
        System.out.println("未排序前：");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        BinaryInsert(a);
        System.out.println("排序后：");
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);

        }
}

   public static void BinaryInsert(int[] a){
       for (int i = 0; i <a.length ; i++) {
           int temp = a[i];
           int left = 0;
           int right = i-1;
           int mid = 0;
           int j;
           while (left<=right){
               mid = (left+right)/2;
               if(temp>a[mid]){
                   left = mid+1;
               }else if(temp<a[mid]){
                    right = mid-1;
               }
           }
           for (j = i-1; j >=left ; j--) {

               a[j + 1] = a[j];
               //a[j+1] = temp;
           }
          if(left != i){
               a[left] = temp;
          }


       }
    }
}
