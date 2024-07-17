package com.example.demo;

import java.util.stream.LongStream;

public class FactorialOfANumber {

	//recurssion O(n)
	static long factorial_recurssion(int input) {		
		 if(input == 0) return 1;
		  else {
			long result = input * factorial_recurssion(input -1);
			return result;
		}
	}
	
	//streams
	static long factorial_streams(int input) {
		long result = LongStream.rangeClosed(1, input).reduce(1, (long a, long b) -> a*b);
				return result; 
		
	}
	
	//brute force O(n)
	static long factorial(int input) {
		if(input < 0) return 0;
		else if(input == 0) return 1;
		else {
			long result = input;
			for(int i=input-1; i > 0 ; --i) {
				result = result * i;
			}
			return result;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(6));
		System.out.println(factorial(0));
		
		System.out.println(factorial_streams(4));
		System.out.println(factorial_streams(6));
		System.out.println(factorial_streams(0));
		
		System.out.println(factorial_recurssion(4));
		System.out.println(factorial_recurssion(6));
		System.out.println(factorial_recurssion(0));
	}
	
}