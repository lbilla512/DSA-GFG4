package com.example.demo.math;


/** 
 * 
 * @author billl
 *
 */
/** 
 * 
 * i/p 789 res 3
 * inp 7 res 1
 *
 */

/**
 * time complexity O(d) d is digits
 *    
 */
public class CountDigits {

	//brute force
	static int countDigits(int input) {
		
		int result = 0;
		//if(input == 0) return 0;
		while(input > 0) {
			input = input/10;
			result++;
		}
		return result;
	}
	
	//streams
   static long countDigits_streams(int input) {
		
		long result =  String.valueOf(input).chars().filter(Character::isDigit).count();
		return result;
	}
	
	
	public static void main(String args[]) {
	
		System.out.println(countDigits(9235));
		System.out.println(countDigits(38));
		System.out.println(countDigits(7));
		
		System.out.println(countDigits_streams(9235));
		System.out.println(countDigits_streams(38));
		System.out.println(countDigits_streams(7));
		
		
	}
	
}