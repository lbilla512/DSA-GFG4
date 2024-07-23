package com.example.demo.bitmagic;


/**
 * Given in an array there is only 1 odd occurrence.
 *  x ^ x  = 0
 *  x ^ y = y ^ x
 *  x ^ 0 = x
 *  x ^ (y ^ z) = (x ^ y) ^ z
 * */
public class TwoOddOccurring {

    static void findOddOccurring(int[] input){
     int size = input.length;
        int x = input[0];
     for(int i = 1; i<size; i++ ){
         x = x ^ input[i];
     }
     int k = (x & (~(x-1)));
     int res1=0,res2=0;
     for(int i=0;i<size;i++){
         if((input[i] & k)!=0)
             res1 = res1^input[i];
         else
             res2 = res2 ^ input[i];
     }
        System.out.println(res1 +" "+res2);

    }
    public static void main(String[] args){
        int[] input = {4,4,7,4,8,7,7,7,8,8}; // 4 - 3 times, 7 - 4 times, 8 - 2 times.
        findOddOccurring(input);
    }
}
