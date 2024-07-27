package com.example.demo.arrays;

public class SecondLargestElementinArray {
    static int LargestElementinArray(int[] array){
        int size = array.length;
        int maxIndex = 0 ;
        for(int currentIndex =1;currentIndex<size;currentIndex++){
            if(array[maxIndex] < array[currentIndex]){
                maxIndex = currentIndex;
            }
        }
       // System.out.println(maxIndex);
        return  maxIndex;
    }
    //O(n*n)
    static void secondLargestElementinArray(int[] array){
      int size = array.length;
        int maxIndex = LargestElementinArray(array);
        int secondMaxIndex = -1 ;

      for(int currentIndex =0;currentIndex<size;currentIndex++){
        //  System.out.println(array[maxIndex] +" "+array[secondMaxIndex]+" "+array[currentIndex]);
          if(array[currentIndex] == array[maxIndex]) continue;
          if(secondMaxIndex == -1){
              secondMaxIndex = currentIndex;
          }
          else if(array[currentIndex] > array[secondMaxIndex])
              secondMaxIndex = currentIndex;
      }
      System.out.println(secondMaxIndex);
    }
     //single traversal O(n)
    static void secondLargestElementinArray_2(int[] array){
        int size = array.length;
        int largestIndex = 0;
        int secondMaxIndex = -1;
        for(int currentIndex = 1;currentIndex<size;currentIndex++){
          //  if(array[currentIndex] == array[largestIndex]) continue;
            if(array[currentIndex] > array[largestIndex]){
             secondMaxIndex = largestIndex;
             largestIndex = currentIndex;
            }
            else if(array[currentIndex] < array[largestIndex]){
                if(secondMaxIndex == -1 || array[secondMaxIndex] < array[currentIndex])
                    secondMaxIndex = currentIndex;
            }
        }
        System.out.println(secondMaxIndex);
    }
    public  static  void main(String[] args){
        int[] array = new int[]{10,5,20,8};
        secondLargestElementinArray_2(array);
        int[] array2 = new int[]{40,8,50,100};
        secondLargestElementinArray_2(array2);
        int[] array3 = new int[]{50,50,50,50};
        secondLargestElementinArray_2(array3);
    }

}
