package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el numero: ");
        int nombre = teclat.nextInt();
        if (nombre%2==0){
            System.out.println("Es parell");
        }
        else{
            System.out.println("Es senar");

        }

    }
}