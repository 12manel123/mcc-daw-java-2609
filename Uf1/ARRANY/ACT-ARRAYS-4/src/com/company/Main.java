package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int [15];
        int b=0;
        while (b<a.length){
            a[b]= random.nextInt(50)+50;
            b++;
        }
        System.out.println(Arrays.toString(a));
        b=0;
        while (b<a.length){
            if (a[b]%2==0){
                System.out.print(a[b]+" ");
            }
            b++;
        }
    }
}