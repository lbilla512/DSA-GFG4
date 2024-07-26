package com.example.demo.recursion;

public class SumOfDigitsOfANumber {

    static int sumOfDigitsOfANumber(int input){
        if(input <= 0)
            return 0;
        int lastDigit = input % 10 ;
        return lastDigit + sumOfDigitsOfANumber(input / 10);
    }

    public static void main(String[] args){
        System.out.println(sumOfDigitsOfANumber(253));
    }
}
