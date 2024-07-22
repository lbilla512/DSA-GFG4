package com.example.demo.bitmagic;

public class CountSetBits {
    int[] lookupTable = new int[256];
    CountSetBits(){
        lookupTable[0] = 0;
        for(int i =1;i<256;i++){
            lookupTable[i] = lookupTable[i&(i-1)]+1;
        }
    }
   //naive
    static int countSetBits(int input){
        int result = 0;
      while(input > 0){
          if(input % 2 == 1)
              result++;
       input = input / 2;
      }
      return result;
    }
    //Brian kerningam's algorithm
    static int countSetBits_2(int input){
        int result = 0;
        while(input > 0){
            input = input & (input -1);
            result ++;
        }
        return result;
    }
    //lookup table
     int countSetBits_3(int input){
        return lookupTable[input & 255] +
                lookupTable[(input >> 8) & 255] +
                lookupTable[(input >> 16) & 255] +
                lookupTable[input >> 24] ;
    }
    public static void main(String[] args){
        System.out.println(countSetBits(5));
        System.out.println(countSetBits(7));
        System.out.println(countSetBits(13));
        System.out.println(countSetBits(6));
        System.out.println(countSetBits_2(5));
        System.out.println(countSetBits_2(7));
        System.out.println(countSetBits_2(13));
        System.out.println(countSetBits_2(6));
        CountSetBits bits = new CountSetBits();

        System.out.println(bits.countSetBits_3(5));
        System.out.println(bits.countSetBits_3(7));
        System.out.println(bits.countSetBits_3(13));
        System.out.println(bits.countSetBits_3(6));
    }
}
