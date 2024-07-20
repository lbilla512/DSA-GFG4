package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratostheness {

     List<Boolean> primes = new ArrayList();
    SieveOfEratostheness(){
        int limit = 150;
        primes.add(0 , false);
        primes.add(1, false);
        for(int i =2 ;i<limit;i++){
            primes.add(i, true);
        }
        for(int i = 2;i*i<=limit;i++){
            if(primes.get(i)) {
                for (int j = 2 * i; j < limit; j = j + i) {
                    primes.set(j, false);
                }
            }
        }
    }
     void findPrimesTillNumber(int input){
        for(int i =2; i< input;i++){
            if(primes.get(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        SieveOfEratostheness primeNumbers = new SieveOfEratostheness();
        primeNumbers.findPrimesTillNumber(50);
        primeNumbers.findPrimesTillNumber(122);

    }

}
