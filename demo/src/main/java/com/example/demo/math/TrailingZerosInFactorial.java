package com.example.demo.math;



public class TrailingZerosInFactorial {

	//brute force
	static int trailingZeros(int input) {
		
		//long factorial = LongStream.rangeClosed(1, input).reduce(1, (a, b) -> a*b);
		long factorial = input;
		for(int i=input -1; i>0;i--) {
			factorial = factorial * i;
		}
		System.out.println("factorial "+factorial);
		
		int trailingZeros = 0;
		while(factorial % 10 == 0) {
			trailingZeros++;
			factorial = factorial/10;
		}
		
		return trailingZeros;
		
	}
	/** if we can figure out number of 5's 2*5 , 10, 
	 * we need to count n/5 + n/25 + n/125 +... 
	 * O(long n)
	 * @param input
	 * @return
	 */
   static int trailingZeros_efficient5(int input) {
	   int trailingZeros = 0;
	   for(int i =5; i<=input;i=i*5) {
		   trailingZeros = trailingZeros + input / i;  
	   }
	  
		return trailingZeros;
		
	}
	
	
	
	public static void main(String args[]) {
		
		System.out.println(trailingZeros_efficient5(4));
		System.out.println(trailingZeros_efficient5(5));
		System.out.println(trailingZeros_efficient5(10));
		System.out.println(trailingZeros_efficient5(100));
		System.out.println(trailingZeros_efficient5(134));
		System.out.println(trailingZeros_efficient5(251));
		System.out.println(trailingZeros_efficient5(1239));
	}
	
}
