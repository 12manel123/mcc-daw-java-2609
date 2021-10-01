package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Iva:");
        double iva = teclat.nextDouble();
        System.out.print("Tomaquet:");
        int tomaquet= (int) teclat.nextInt();
        System.out.print("Cantitat:");
        int tomaquetcant= (int) teclat.nextInt();

        System.out.println(iva/100);
        System.out.print("Preu:"+((tomaquet+(tomaquet*(iva/100)))*tomaquetcant));

    }
}