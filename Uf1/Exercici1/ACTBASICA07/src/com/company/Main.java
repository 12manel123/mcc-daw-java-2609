package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int costat = (int) teclat.nextDouble();
        System.out.println("Perimetre:"+(costat * 4));
        System.out.println("Àrea:"+(costat * costat));

    }
}