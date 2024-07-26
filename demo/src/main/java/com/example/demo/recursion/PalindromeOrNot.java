package com.example.demo.recursion;

import io.micrometer.common.util.StringUtils;

public class PalindromeOrNot {

    static boolean palindromeOrNot(String input, int startIndex, int endIndex){
      if(startIndex >= endIndex) return  true;

      return ((input.charAt(startIndex) == input.charAt(endIndex)) && palindromeOrNot(input, startIndex+1, endIndex-1));

    }
    public static void main(String[] args){
        System.out.println(palindromeOrNot("abbcbba",0,7));

    }

}
