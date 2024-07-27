package com.example.demo.arrays;

import java.util.Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] array){
      int size = array.length;
      for(int currentIndex = 0; currentIndex<size/2;currentIndex++){
          int temp = array[currentIndex];
          int swapIndex = size-currentIndex-1;
          array[currentIndex] = array[swapIndex];
          array[swapIndex] = temp;
      }
      return array;
    }
    static void printArrayElements(int[] array){
       System.out.println("printing array elements");
       Arrays.stream(array).forEach(System.out::println);
    }
    public  static  void main(String[] args){
        int[] array = new int[]{10,5,20,8};
        int[] arrayReverse =   reverseArray(array);
        printArrayElements(arrayReverse);

        int[] array3 = new int[]{40,8,10, 50,100};
        int[] array3Reverse =reverseArray(array3);
        printArrayElements(array3Reverse);
    }
}
