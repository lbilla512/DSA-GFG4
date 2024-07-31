package com.example.demo.search;

public class BinarySearch {
static int findUsingBinarySearch(int[] array, int element){
    int low = 0;
    int high = array.length-1;
    int mid = (low+high)/2;
   // System.out.println(low+" "+mid+" "+high);
    while(low <= high){
        mid = (low+high)/2;
     //   System.out.println(low+" "+mid+" "+high);
        if(array[mid] == element){
            return mid;
        }
        else if(array[mid] > element){
           high = mid-1;
        }else{
         low = mid+1;
        }
    }
    return -1;
}
public static  void main(String[] args){
    int[] array = {10,20,30,40,50,60};
    System.out.println(findUsingBinarySearch(array,50));
    System.out.println(findUsingBinarySearch(array,45));
    System.out.println(findUsingBinarySearch(array,5));
    System.out.println(findUsingBinarySearch(array,70));
}
}
