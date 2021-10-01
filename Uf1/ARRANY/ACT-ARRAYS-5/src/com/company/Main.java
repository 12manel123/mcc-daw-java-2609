package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int [10];
        int b=0;
        while (b<a.length){
            a[b]= random.nextInt(1000);
            b++;
        }
        System.out.println(Arrays.toString(a));
        b=9;
        while (b>=0){
            System.out.print(a[b]+" ");
            b--;
        }
    }
}