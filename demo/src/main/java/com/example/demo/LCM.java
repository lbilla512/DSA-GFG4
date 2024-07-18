package com.example.demo;

import java.util.stream.IntStream;
//
public class LCM {

	
	//euclidean algorithm
	static int findGCD(int first, int second){
		if(second == 0 ) 
			return first;
		else 
			return findGCD(second, first % second);		
	}
		
	// lcm = (first * second)/gcd(first , second)
	static int findLCM(int first, int second) {
		
		int gcd = findGCD(first , second);
	//	System.out.println("gcd "+gcd);
		return (first*second)/gcd; 	
	}
	
	//streams
	static int findLCM_streams(int first, int second) {
		int max = Math.max(first, second);
		int min = Math.min(first, second);
		int lcm = IntStream.iterate(max, i->i+max)
				.filter(i->i%min == 0)
				.findFirst()
				.getAsInt();
		return lcm;
	}
	
	public static void main(String[] args) {
		
		System.out.println(findLCM(4,6));
		System.out.println(findLCM(12,15));
		System.out.println(findLCM(2,8));
		System.out.println(findLCM(3,7));
		System.out.println(findLCM_streams(4,6));
		System.out.println(findLCM_streams(12,15));
		System.out.println(findLCM_streams(2,8));
		System.out.println(findLCM_streams(3,7));
	}
	
}
