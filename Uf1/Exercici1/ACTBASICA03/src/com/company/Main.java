package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra el valor per a la variable a:");
        int a = (int) teclat.nextDouble();
        System.out.println("Entra el valor per a la variable b:");
        int b = (int) teclat.nextDouble();
        System.out.println("El valor de a és: " + a);
        System.out.println("El valor de b és: " + b);
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "/" + b + "=" + a / b);
        System.out.print(a + "*" + b + "=" + a * b);
    }
}
