package com.example.demo.arrays;

import java.util.Arrays;

public class FrequenciesInSortedArray {

   static void   frequenciesInSortedArray(int[] array){
     int size = array.length;
       //System.out.println(size);
       int element = array[0];
       int count = 1;
       for(int i =1;i<size;i++){
           if(element == array[i]){
               count++;
           }else{
               System.out.println("element "+element+" count "+count);
               element = array[i];
               count = 1;
           }
       }
       System.out.println("element "+element+" count "+count);
   }
   static void printArray(int[] array){
       Arrays.stream(array).forEach(System.out::println);
   }
   public  static  void main(String[] args){
      int[] array = new int[]{10,10,10,25,30,30};
       frequenciesInSortedArray(array);
   }
}
