package com.example.demo;

import java.util.stream.IntStream;

/**
 * 
 * @author billl
 *
 */
/***
 * i/p 78987 o/p yes  i/p 8668 o/p yes   i/p 8 o/p yes
 * i/p 21 o/p no  i/p 367 o/p no
 */
public class PalindromeNumber {
	
	//brute force
	static boolean isPalindrome(int input) {
		String inputString = Integer.toString(input);
		int size = inputString.length();
		int noOfIterations = 0;
		for(int i = 0; i < size/2; i++) {
			if(inputString.charAt(i) != inputString.charAt(size-i-1)) {
				return false;
			}
			noOfIterations++;
		}
		if(noOfIterations == size/2)
		return true;
		else return false;
	}
	
	//modulo and division
	static boolean isPalindrome2(int input) {
		int reverse = 0;
		int originalInput = input;
		while(input != 0) {
			int moduloDigit = input % 10 ;
			input = input / 10;
			reverse = reverse*10 + moduloDigit;
		}
		
		return reverse == originalInput;
		
	}
	
	//streams
	static boolean isPalindrome_Streams(int input) {
		String inputString = String.valueOf(input);
		int size = inputString.length();
		boolean isPalindrome = IntStream.range(0, size/2)
				.allMatch(i -> inputString.charAt(i) == inputString.charAt(size-i-1));
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome2(78987));
		System.out.println(isPalindrome2(21));
		System.out.println(isPalindrome2(8));
		System.out.println(isPalindrome2(8668));
		System.out.println(isPalindrome2(367));
		
		System.out.println(isPalindrome_Streams(78987));
		System.out.println(isPalindrome_Streams(21));
		System.out.println(isPalindrome_Streams(8));
		System.out.println(isPalindrome_Streams(8668));
		System.out.println(isPalindrome_Streams(367));
				
	}

}