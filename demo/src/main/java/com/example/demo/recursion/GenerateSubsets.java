package com.example.demo.recursion;

import io.micrometer.common.util.StringUtils;

//TODO not completed
public class GenerateSubsets {

    static void generateSubsets(String input){
        if(StringUtils.isEmpty(input)) return ;
        System.out.println(input);
        int length = input.length();
        generateSubsets(input.substring(0,length-1));
        generateSubsets(input.substring(1,length-1));
        for(int i = 2; i<length;i++){
            generateSubsets(input.substring(i-1,i)+input.substring(i+1,length-1));
        }
    }

    public static void main(String[] args){
        generateSubsets("ABCD");
    }
}
