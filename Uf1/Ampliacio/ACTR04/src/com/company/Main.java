package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Entra num 1: ");
        int a = teclat.nextInt();
        System.out.print("Entra num 2: ");
        int b = teclat.nextInt();

        while (b==a){
            System.out.print("has repetit número! Entra num2: ");
            b = teclat.nextInt();

        }
        System.out.println("OK!");




    }

}
