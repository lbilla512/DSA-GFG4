package com.example.demo.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	static boolean isPrime(int input) {
		if(input  == 1) {
			return false;
		}
		for(int i = 2 ;i*i < input; i++) {
			if(input % i == 0) {
				return false;
			}				
		}	
		return true;
	}
	
	static List<Integer> findPrimeFactors(int input) {
		List<Integer> result = new ArrayList();
		if(input  == 1 || isPrime(input)) {
			result.add(input);
			return result;
		}		
		
		for(int i = 2; i <= input; i++) {
			if(isPrime(input)) {
				result.add(input);
				break;
			} 
			if(isPrime(i)) {
				while(input % i == 0) {
					result.add(i);
					input = input / i;	
				}				
			}
			else {
				continue;
			}
		}
		
		return result;
		
	}
	//efficient
	static void findPrimeFactors_2(int input) {
		if(input <= 1) {
			System.out.println(input);	
		}
		for(int i =2; i*i <= input;i++) {
			while(input % i == 0) {
				System.out.println(i);
				input = input / i;
			}
		}
		if(input > 1){
			System.out.println(input);
		}
		
	}
	
	//efficient
		static void findPrimeFactors_3(int input) {
			if(input <= 1) {
				System.out.println(input);	
			}
			while(input % 2  == 0) {
				System.out.println(2);
				input = input / 2;
			}
			while(input % 3  == 0) {
				System.out.println(3);
				input = input / 3;
			}
			for(int i =5; i*i <= input;i=i+6) {
				while(input % i == 0) {
					System.out.println(i);
					input = input / i;
				}
				int j = i+2;
				while(input % (j) == 0) {
					System.out.println(j);
					input = input / (j);
				}
			}
			if(input > 3){
				System.out.println(input);
			}
			
		}
		
	static void printNumbersInArray(List<Integer> input) {
		System.out.println("printing numbers from an array");
		for(int  i: input) {
			System.out.println(i);	
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		List<Integer> result = findPrimeFactors(12);
		printNumbersInArray(result);		
		 result = findPrimeFactors(13);
		 printNumbersInArray(result);		 
		 result = findPrimeFactors(315);
		 printNumbersInArray(result);		 
		 
		 findPrimeFactors_2(12);
		 findPrimeFactors_2(13);
		 findPrimeFactors_2(315);
		 System.out.println();
		 
		 findPrimeFactors_3(12);
		 findPrimeFactors_3(13);
		 findPrimeFactors_3(315);
		
	}
	
}
