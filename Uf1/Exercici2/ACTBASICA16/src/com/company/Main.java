package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix nota1: ");
        double a = teclat.nextInt();
        System.out.print("Introdueix nota2: ");
        double b = teclat.nextInt();
        System.out.print("Introdueix nota3: ");
        double c = teclat.nextInt();
        System.out.print("Introdueix nota4: ");
        double d = teclat.nextInt();
        double mitgana = (((a*20)/100)+((b*20)/100)+(((c*30)/100))+((d*30)/100));

        if (mitgana>=5){
            System.out.println("Has aprovat");
        }
        else{
            System.out.println("Has sospes");

        }

    }
}
