package com.example.demo.arrays;

public class CheckIfArrayIsSorted {
    static void checkIfArrayIsSorted(int[] array){
      int size = array.length;
      boolean ascendingOrder = true, descendingOrder = true ;
      for(int currentIndex =0;currentIndex<size-1;currentIndex++){
          if(array[currentIndex] > array[currentIndex+1]){
              ascendingOrder = false; break;
          }
      }
        for(int currentIndex =0;currentIndex<size-1;currentIndex++){
            if(array[currentIndex] < array[currentIndex+1]){
                descendingOrder = false; break;
            }
        }
      System.out.println(ascendingOrder || descendingOrder);
    }
    public  static  void main(String[] args){
        int[] array = new int[]{10,5,20,8};
        checkIfArrayIsSorted(array);
        int[] array2 = new int[]{40,8,50,100};
        checkIfArrayIsSorted(array2);
        int[] array3 = new int[]{8,40,50,100};
        checkIfArrayIsSorted(array3);
        int[] array4 = new int[]{100,50,40,8};
        checkIfArrayIsSorted(array4);
        int[] array5 = new int[]{100,50,50,8};
        checkIfArrayIsSorted(array5);
    }

}
