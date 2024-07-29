package com.example.demo.arrays;

import java.util.Arrays;

public class MovesZerosToEnd {

   static int[]   moveZerosToEnd(int[] array){
     int size = array.length;
     int zeroCount = 0;
     for(int i =0;i<size;i++){
        if(array[i] != 0 ){
            int temp = array[zeroCount];
            array[zeroCount] = array[i];
            array[i] = temp;
            zeroCount++;
        }
     }
     return array;
   }
   static void printArray(int[] array){
       Arrays.stream(array).forEach(System.out::println);
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,20,0,30,0,0,32,0};
      array = moveZerosToEnd(array);
      printArray(array);
   }
}
