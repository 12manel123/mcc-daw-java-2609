package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Edat:");
        int a = (int) teclat.nextDouble();
        System.out.println("Vas neixer l'any: "+(-(a-2020)));


    }
}
