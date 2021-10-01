package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Valor: ");
        int[] c =new int [20];
        int a = teclat.nextInt();
        int b=0;
        System.out.print("El numero "+a+" en binari és el número: ");
        while(a!=0){
            c[b]=a%2;
            System.out.print(a%2);
            a=a/2;
            b++;
        }




    }
}