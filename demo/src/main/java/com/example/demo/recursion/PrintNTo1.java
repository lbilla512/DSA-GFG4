package com.example.demo.recursion;

public class PrintNTo1 {

    static void printNTo1(int input){
        if(input <= 0)
            return;
        System.out.println(input);
        printNTo1(input -1);
    }
    public static void main(String[] args){
        printNTo1(5);

    }

}
