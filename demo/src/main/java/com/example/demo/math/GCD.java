package com.example.demo.math;

import java.util.stream.IntStream;


// GCD or HCF
public class GCD {

	// optimized solution euclidean algorithm
	static int findGCD(int firstNumber, int secondNumber) {
		/**while(firstNumber !=  secondNumber) {
			if(firstNumber > secondNumber) {
				firstNumber = firstNumber - secondNumber;
				}
			else {
				secondNumber = secondNumber - firstNumber;
			}
		}
		return firstNumber;*/
		
		if(secondNumber == 0) return firstNumber;
		else 
			return findGCD(secondNumber , firstNumber % secondNumber);
		
	} 
	
	// streams 1...min of 2 numbers.. O(min(n,m))
	static int findGCD_streams(int firstNumber, int secondNumber) {
		int result = IntStream.rangeClosed(1, Math.min(firstNumber, secondNumber))
		.filter(i -> firstNumber % i == 0 && secondNumber % i ==0)
		.max()
		.getAsInt();
		return result;
		
	} 
	
	public static void main(String[] args) {
		System.out.println(findGCD(4,6));
		System.out.println(findGCD(100,200));
		System.out.println(findGCD(7,13));
		
		System.out.println(findGCD_streams(4,6));
		System.out.println(findGCD_streams(100,200));
		System.out.println(findGCD_streams(7,13));
	}
	
}
