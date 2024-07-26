package com.example.demo.recursion;

public class RopeCutting {

    //count max pieces of a rope we can cut by using a , b , c
    static int maxPieces(int input, int a, int b , int c){
        if(input < 0) return -1;
        if(input == 0)
            return 0;
        int aMax = maxPieces(input-a,a,b,c);
        int bMax =   maxPieces(input-b,a,b,c);
        int cMax =   maxPieces(input-c,a,b,c);
        int maxAb = Math.max(aMax, bMax);
        int result = Math.max(maxAb, cMax);
        if(result == -1) return -1;
        return result+1;
    }

    public static void main(String[] args){
        System.out.println(maxPieces(5,2,5,1));
        System.out.println(maxPieces(23,12,9,11));
        System.out.println(maxPieces(5,4,2,6));
    }
}
