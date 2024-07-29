package com.example.demo.arrays;

import java.util.Arrays;

public class LeftRotateByOne {

   static int[]   leftRotateByOne(int[] array, int rotateCount){
     int size = array.length;
       System.out.println(size);
       rotateCount = rotateCount % size;
       int[] array2 = new int[rotateCount];
       for(int i =0;i<rotateCount;i++){
           System.out.println("copy "+ array[i]);
          array2[i] = array[i];
       }
     for(int i =rotateCount;i<size;i++){
         System.out.println("copy 2 "+ array[i]);
        array[i-rotateCount] = array[i];
     }
     for(int i =0;i<rotateCount;i++){
         System.out.println("copy 3 "+ array2[i]);
         array[size-rotateCount+i] = array2[i];
     }
     return array;
   }
   static void printArray(int[] array){
       Arrays.stream(array).forEach(System.out::println);
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,20,0,30,0,0,32};
      array = leftRotateByOne(array, 5);
      printArray(array);
   }
}
