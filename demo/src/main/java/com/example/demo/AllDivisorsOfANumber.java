package com.example.demo;

public class AllDivisorsOfANumber {

    static void allDivisorsOfANumber(int input){
        for(int i =1; i*i <= input; i++){
           if(input % i == 0){
               System.out.println(i);
               if(i  != input /i) {
                   System.out.println(input / i);
               }
           }
        }
    }
    public static void main(String[] args){
        allDivisorsOfANumber(15);
        allDivisorsOfANumber(100);
        allDivisorsOfANumber(7);
    }
}
