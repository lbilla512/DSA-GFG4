package com.example.demo.search;

public class BinarySearchRecursive {
static int findUsingBinarySearch(int[] array,int low, int high, int element){
        if(low > high) return  -1;
        int mid = (low+high)/2;
        if(array[mid] == element){
            return mid;
        }
        else if(array[mid] > element){
            return   findUsingBinarySearch(array,low,mid-1,element);
        }else {
            return   findUsingBinarySearch(array,mid+1,high,element);
        }
}
public static  void main(String[] args){
    int[] array = {10,20,30,40,50,60};
    System.out.println(findUsingBinarySearch(array,0,5,50));
    System.out.println(findUsingBinarySearch(array,0,5,45));
    System.out.println(findUsingBinarySearch(array,0,5,5));
    System.out.println(findUsingBinarySearch(array,0,5,70));
}
}
