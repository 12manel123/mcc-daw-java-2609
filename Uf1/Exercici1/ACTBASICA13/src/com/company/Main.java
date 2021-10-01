package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int numA, numB, aux;
        System.out.print("Valor de A: ");
        numA = teclat.nextInt();
        System.out.print("Valor de B: ");
        numB = teclat.nextInt();
        System.out.println("Valor inicial: A = " + numA + "   B = " + numB);

        aux = numA;
        numA = numB;
        numB = aux;

        System.out.println("Valor intercambiat: A = " + numA + "   B = " + numB);
    }
}
