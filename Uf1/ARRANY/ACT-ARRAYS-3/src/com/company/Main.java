package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int [12];
        int b=0;
        while (b<a.length){
            a[b]= random.nextInt(100)+1;
            b++;
        }
        System.out.println(Arrays.toString(a));
        b=0;
        while (b<a.length){
            a[b]= a[b]*2;
            b++;
        }
        System.out.println(Arrays.toString(a));
    }
}