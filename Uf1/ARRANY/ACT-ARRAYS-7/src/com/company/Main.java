package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        int[] a =new int [10];
        int b=0;
        while (b<a.length){
            a[b]= random.nextInt(100);
            b++;
        }
        System.out.println(Arrays.toString(a));
        int c= teclat.nextInt();
        b=0;
        while (b<a.length){
            if (c==a[b]){
                System.out.println("Es un num de la llista");
            }
            b++;
        }
    }
}