package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Intodueix numero: ");
        int i = teclat.nextInt();
        int a = 1;


            while(a<8){
                if (i<0){
                System.out.println("Es negatiu");
                }

                else {
                System.out.println("Es positiu");
                }

                System.out.print("Intodueix numero: ");
                i = teclat.nextInt();
                a = a + 1;


        }

        System.out.println("Adeu");

    }
}