package com.company.search;

public class BinarySearch {

    public static int binarySearch(int [] arr, int n,int target){

        int l=0;
        int r = n-1;
        while(l<=r){
            int mid = (r+l)/2;
            if(target > arr[mid]){
                l = mid+1;
                //System.out.println(l);
            }else if(target < arr[mid]){
                r = mid -1;
                //System.out.println(r);
            }else{
                //System.out.println(mid);
                return mid;

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {2,5,11,0,7,9,34};
        int n = arr.length;
        //int n = 7;
        int target = 0;
        int mid = binarySearch(arr,n,target);
        System.out.println(mid);

    }
}
