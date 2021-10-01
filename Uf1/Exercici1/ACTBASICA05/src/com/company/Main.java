package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a = (int) teclat.nextDouble();
        int b = (int) teclat.nextDouble();
        int c = (int) teclat.nextDouble();
        int d = (int) teclat.nextDouble();
        System.out.println("Suma:"+(a+b+c+d));
        System.out.println("Mitgana:"+((a+b+c+d)/4));


    }
}