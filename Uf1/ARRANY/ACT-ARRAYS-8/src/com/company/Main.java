package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int[] a =new int [10];
        int b=0,c=0,d=0;
        while (b<a.length){
            a[b]= teclat.nextInt();
            if (c>a[b]){
                d=1;
            }
            c=a[b];
            b++;
        }
        System.out.println(Arrays.toString(a));
        if (d==0){
            System.out.println("Es crecient");
        }
        else{
            System.out.println("No es crecient");
        }
    }
}