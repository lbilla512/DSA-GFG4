package com.example.demo.arrays;

import java.util.Arrays;

public class LeadersInAnArray {

   static void   leadersInAnArray(int[] array){
     int size = array.length;
       //System.out.println(size);
       int leader = array[size-1];
       System.out.println(leader);
       for(int i =size-2;i>=0;i--){
           if(array[i] > leader){
               System.out.println( array[i]);
               leader = array[i];
           }
       }
   }
   static void printArray(int[] array){
       Arrays.stream(array).forEach(System.out::println);
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,20,6,30,5,4,2};
        leadersInAnArray(array);
   }
}
