package com.example.demo.search;

public class IndexOfLastOccurence {
static int indexOfLastOccurence(int[] array, int element){
    int low = 0;
    int high = array.length-1;
    int size= array.length;
    int mid = (low+high)/2;
   // System.out.println(low+" "+mid+" "+high);
    while(low <= high){
        mid = (low+high)/2;
      //  System.out.println(low+" "+mid+" "+high);

         if(array[mid] > element){
           high = mid-1;
        }else if(array[mid] < element){
         low = mid+1;
        }else{
             if((mid == size-1) || (array[mid] != array[mid+1])){
                 return mid;
             }else{
                 low = mid+1;
             }
         }

    }
    return -1;
}
public static  void main(String[] args){
    int[] array = {10,10,30,50,50,60, 60,60};
    System.out.println(indexOfLastOccurence(array,50));
    System.out.println(indexOfLastOccurence(array,10));
    System.out.println(indexOfLastOccurence(array,5));
    System.out.println(indexOfLastOccurence(array,60));
}
}
