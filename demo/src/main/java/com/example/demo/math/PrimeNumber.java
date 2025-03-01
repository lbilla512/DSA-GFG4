package com.example.demo.math;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumber {
	int limt1 = 500 ;
	List<Boolean> primes = new ArrayList<Boolean>(limt1);
		
	// O(n*sqrt(n))  not best 
	PrimeNumber(){
		primes.add(0, false);
		primes.add(1, false);
		for(int i = 2;i< limt1;i++) {
			//System.out.println(i);
			primes.add(i, true);
		}
		for(int i=4;i<limt1;i=i+2) {
			
			primes.set(i, false);
		}
		for(int i=6;i<limt1;i=i+3) {
			primes.set(i, false);
		}
		for(int i=10;i<limt1;i=i+5) {
			primes.set(i, false);
		}
		for(int i=14;i<limt1;i=i+7) {
			primes.set(i, false);
		}
		for(int i = 4;i<limt1;i++) {
			if(primes.get(i)) {
			for(int j =2; j*j<=i;j++) {
				if(i % j == 0) {
					primes.set(i, false);
				}
			}
			}
		}
	}
	
	Boolean isPrimerNumber(int input) {
		
		return primes.get(input);
		
	}
	//brute force O(n)
	static boolean isPrime(int input) {
		if(input == 1) return false;
		else {
			for(int i=2;i<input;i++) {
				if(input % i == 0) {
					return false;
				}
					
			}
			return true;
		}		
	}
	
	// O(sqrt(n)) best divisor should exist in pairs.. one divisor will be less than sqrt(n)
	static boolean isPrime_2(int input) {
		if(input == 1) return false;
		else {
			for(int i=2;i*i<=input;i++) {
				if(input % i == 0) {
					return false;
				}
					
			}
			return true;
		}			
	}
	
	// more efficient... O(sqrt(n)) best divisor should exist in pairs.. one divisor will be less than sqrt(n)
		static boolean isPrime_3(int input) {
			if(input == 1) return false;
			if(input == 2 || input == 3) return true;
			if(input % 2 ==0 || input % 3 == 0) return false;
		    for(int i=5;i*i <= input ;i = i+6) {
			if(input % i == 0 || input%(i+2)==0) return false; 
		    }
		    return true;
		}
		//streams O(n)
		static boolean isPrime_streams(int input) {
			if(input == 1) return false;
			boolean result = IntStream.range(2, input)
			.noneMatch(i -> input % i == 0);
			return result;
			
		}
	
	public static void main(String[] args) {
		PrimeNumber primeNuber = new PrimeNumber();
		
		System.out.println(primeNuber.isPrimerNumber(13));
		System.out.println(primeNuber.isPrimerNumber(14));
		System.out.println(primeNuber.isPrimerNumber(101));
		System.out.println(primeNuber.isPrimerNumber(121));
		
		System.out.println(isPrime(13));
		System.out.println(isPrime(14));
		System.out.println(isPrime(101));
		System.out.println(isPrime(121));
		
		System.out.println(isPrime_2(13));
		System.out.println(isPrime_2(14));
		System.out.println(isPrime_2(101));
		System.out.println(isPrime_2(121));
		
		System.out.println(isPrime_3(13));
		System.out.println(isPrime_3(14));
		System.out.println(isPrime_3(101));
		System.out.println(isPrime_3(121));
		
		System.out.println("with streams");
		System.out.println(isPrime_streams(13));
		System.out.println(isPrime_streams(14));
		System.out.println(isPrime_streams(101));
		System.out.println(isPrime_streams(121));
	}
}
