package com.example.demo.bitmagic;

public class KthBitIsSet {
static boolean kthBitIsSetOrNot(int input, int k){
          // int kValue = (int)Math.pow(2, k-1);
           int kValue = (1 << (k-1));
           if((input & kValue) != 0) return true;
           else return false;
}
public static void main(String[] args){
    System.out.println(kthBitIsSetOrNot(3, 1));
}
}
