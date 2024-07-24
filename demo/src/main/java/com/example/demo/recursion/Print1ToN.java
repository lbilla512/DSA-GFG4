package com.example.demo.recursion;

public class Print1ToN {

    static void print1ToN(int input){
        if(input <= 0)
            return;
        print1ToN(input - 1);
        System.out.println(input);

    }
    public static void main(String[] args){
        print1ToN(5);

    }

}
