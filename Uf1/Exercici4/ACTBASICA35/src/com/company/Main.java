package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        char i;
        int a = 1;


        while(a<7){
            System.out.print("Intodueix valor: ");
            i = teclat.next().charAt(0);
            if (i<='Z'){
                System.out.println("Es Mayuscula");
            }
            else {
                if (i<='a'){
                    System.out.println("Es Minuscula");
                }
                else{
                    System.out.println("Altre caracter");
                }
            }
            a = a + 1;


        }

        System.out.println("Adeu");

    }
}
