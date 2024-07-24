package com.example.demo.recursion;

public class TailRecursive {

    static void tailRecursive(int input, int limit){
        if(input < limit)
            return;
        System.out.println(limit);
        tailRecursive(input, limit+1); //modern compilers chnage this code to n=n-1 goto Start // this executes the program faster
    }

    public static void main(String[] args){
        tailRecursive(5, 1);
    }
}
