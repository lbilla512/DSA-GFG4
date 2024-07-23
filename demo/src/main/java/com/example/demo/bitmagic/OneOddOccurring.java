package com.example.demo.bitmagic;


/**
 * Given in an array there is only 1 odd occurrence.
 *  x ^ x  = 0
 *  x ^ y = y ^ x
 *  x ^ 0 = x
 *  x ^ (y ^ z) = (x ^ y) ^ z
 * */
public class OneOddOccurring {

    static int findOddOccurring(int[] input){
     int size = input.length;
        int result = input[0];
     for(int i = 1; i<size; i++ ){
         result = result ^ input[i];
     }
        return result;
    }
    public static void main(String[] args){
        int[] input = {4,4,7,4,8,7,7,7,8}; // 4 - 3 times, 7 - 4 times, 8 - 2 times.
        System.out.println(findOddOccurring(input));
    }
}
