package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix a: ");
        int a = teclat.nextInt();
        System.out.print("Introdueix b: ");
        int b = teclat.nextInt();
        if (a>b){
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a/b);
        }
        else{
            System.out.println("FATAL ERROR");

        }

    }
}
