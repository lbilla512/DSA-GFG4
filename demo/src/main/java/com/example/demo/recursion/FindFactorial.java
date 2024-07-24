package com.example.demo.recursion;

public class FindFactorial {

    static int findFactorial(int input){
        if(input <= 1)
            return 1;
      return input * findFactorial(input-1);
    }

    public static void main(String[] args){
       System.out.println( findFactorial(5));
    }
}
