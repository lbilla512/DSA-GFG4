package com.example.demo.arrays;

import java.util.Arrays;

public class MaxDifference {

   static void   maxDifference(int[] array){
     int size = array.length;
       //System.out.println(size);
       int min = array[0];
       int result = array[1]-array[0];
       for(int i =1;i<size;i++){
          result = Math.max(result, array[i]-min);
          min = Math.min(min, array[i]);
       }
       System.out.println(result);
   }
   static void printArray(int[] array){
       Arrays.stream(array).forEach(System.out::println);
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,20,6,30,5,4,2};
       maxDifference(array);
      //printArray(array);
   }
}
