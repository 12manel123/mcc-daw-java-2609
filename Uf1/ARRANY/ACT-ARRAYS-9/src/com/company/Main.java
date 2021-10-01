package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int[] a =new int [10];
        int b=0;
        while (b<a.length){
            System.out.print("Valor "+b+": ");
            a[b]= teclat.nextInt();
            b++;
        }
        int c = a[0];
        for (int d = 1; d < a.length; d++) {
            if (a[d] > c) {
                c = a[d];
            }
        }
        int e = a[0];
        for (int d = 1; d < a.length; d++) {
            if (a[d] < e) {
                e = a[d];
            }
        }
        System.out.println("El major es: " + c);
        System.out.println("El menor es: " + e);
    }
}