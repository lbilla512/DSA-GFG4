package com.example.demo.recursion;

public class SumOfNNatualNumbers {

    static int sumOfNNatualNumbers(int input){
        if(input <= 0)
            return 0;
        return input + sumOfNNatualNumbers(input -1);
    }
    public static void main(String[] args){
        System.out.println(sumOfNNatualNumbers(5));

    }

}
