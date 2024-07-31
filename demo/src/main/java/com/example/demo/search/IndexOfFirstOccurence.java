package com.example.demo.search;

public class IndexOfFirstOccurence {
static int indexOfFirstOccurence(int[] array, int element){
    int low = 0;
    int high = array.length-1;
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
             if((mid == 0) || (array[mid] != array[mid-1])){
                 return mid;
             }else{
                 high = mid-1;
             }
         }

    }
    return -1;
}
public static  void main(String[] args){
    int[] array = {10,10,30,50,50,60, 60,60};
    System.out.println(indexOfFirstOccurence(array,50));
    System.out.println(indexOfFirstOccurence(array,10));
    System.out.println(indexOfFirstOccurence(array,5));
    System.out.println(indexOfFirstOccurence(array,60));
}
}
