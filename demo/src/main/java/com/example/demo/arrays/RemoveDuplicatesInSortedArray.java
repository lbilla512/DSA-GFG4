package com.example.demo.arrays;

public class RemoveDuplicatesInSortedArray {

   static int   removeDuplicatesInSortedArray(int[] array){
     int size = array.length;
     int result = 1;
     for(int i =1;i<size;i++){
        if(array[i] != array[result-1]){
           array[result] = array[i];
           result++;
        }
     }
     return result;
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,20,20,30,30,30,30,40};
      System.out.println(removeDuplicatesInSortedArray(array));
   }
}
