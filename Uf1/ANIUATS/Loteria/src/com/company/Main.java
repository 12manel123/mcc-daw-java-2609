package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclat = new Scanner(System.in);
        int[] a = new int[6];
        int[] c = new int[6];
        int b = 0,e=0;
        while(b<6){
            c[b]=teclat.nextInt();
            b++;
        }
        b=0;
        while (b < 6) {
            a[b]= random.nextInt(49);
            b++;
        }
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(a));
        b=0;
        while(b<6){
            if (a[b]==c[b]){
                e++;
            }
            b++;
        }
        if (e>=1){ System.out.println("Has accertat "+e+" cops");}
        else{ System.out.println("No has trobat ningun");}

    }
}