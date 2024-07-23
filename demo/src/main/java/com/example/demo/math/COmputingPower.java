package com.example.demo.math;

public class COmputingPower {
    static long computePower(int input,int power){
        if(power == 0) return 1;
        if(power == 1) return input;
        long result = computePower(input, power/2)*computePower(input, power/2);
        if(power % 2 ==0){
            return result;
        }else{
            return result * input;
        }
    }
  public static void main(String[] args){
     System.out.println(computePower(2, 3)) ;
      System.out.println(computePower(2, 6)) ;
      System.out.println(computePower(3, 4)) ;
      System.out.println(computePower(5, 0)) ;
      System.out.println(computePower(5, 1)) ;

  }
}
