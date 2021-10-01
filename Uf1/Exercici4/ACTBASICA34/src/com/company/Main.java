package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Intodueix numero: ");
        int i = teclat.nextInt();
        int a = 0;
        while(a<=10){
            System.out.println(a +" x "+i+" = "+(a*i));
            a = a+ 1;


        }

    }
}
