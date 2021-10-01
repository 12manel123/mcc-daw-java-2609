package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Intodueix numero: ");
        int i = teclat.nextInt();
        while(i!=0){
            if (i<0){
                System.out.println("Es negatiu");
            }
            else {
                System.out.println("Es positiu");
            }
            System.out.print("Intodueix numero: ");
            i = teclat.nextInt();

        }
        System.out.println("Adeu");

    }
}