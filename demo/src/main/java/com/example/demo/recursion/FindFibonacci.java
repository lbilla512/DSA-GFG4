package com.example.demo.recursion;

public class FindFibonacci {

    static int findFibonacci(int input){
        if(input  <= 0) return 0;
        if(input ==1) return 1;
      return findFibonacci(input-1)+findFibonacci(input-2);
    }

    public static void main(String[] args){
        System.out.println( findFibonacci(5));
    }
}
