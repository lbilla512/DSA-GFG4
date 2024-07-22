package com.example.demo.bitmagic;

public class PowerOfTwo {
    //naive
    static boolean isPowerOfTwo(int input){
     if(input == 0) return false;
     while(input != 1){
         if(input % 2 !=0)
             return false;
         input = input / 2;
     }
     return true;
    }

    //brian curningam's algo
    static boolean isPowerOfTwo_2(int input){

        if(input == 0) return false;
        return ((input & (input -1)) == 0);
    }

    public  static  void main(String[] args){
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo_2(4));
        System.out.println(isPowerOfTwo_2(6));
        System.out.println(isPowerOfTwo_2(1));
        System.out.println(isPowerOfTwo_2(0));
    }
}
