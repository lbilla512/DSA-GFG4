package com.example.demo.recursion;


//TODO incomplete
public class TowerOfHanoi {

    static void towerOfHanoi(int[] a, int[]b, int[] c, int length){
        if(length == 1){
            System.out.println("move 1 from a to c");
            return;
        }
        towerOfHanoi(a,c,b,length-1);
        System.out.println("move 1 from a to c");
        towerOfHanoi(b,a,c,length-1);

    }
    public static void main(String[] args){
        int[] a,b,c;
        int length = 3;
        a=new int[]{1,2,3};
        b= new int[length];
        c= new int[length];
        towerOfHanoi(a,b,c, length);

        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        System.out.println(a[1]);
        System.out.println(b[1]);
        System.out.println(c[1]);
        System.out.println(a[2]);
        System.out.println(b[2]);
        System.out.println(c[2]);

    }

}
