package com.example.demo.arrays;

public class LargestElementinArray {
    static void largestElementinArray(int[] array){
      int size = array.length;
      int j = 0 ;
      for(int i =1;i<size;i++){
          if(array[j] < array[i]){
              j = i;
          }
      }
      System.out.println(j);
    }
    public  static  void main(String[] args){
        int[] array = new int[]{10,5,20,8};
        largestElementinArray(array);
        int[] array2 = new int[]{40,8,50,100};
        largestElementinArray(array2);
    }

}
