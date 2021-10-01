package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);


        System.out.print("Caracter: ");
        char caracter=teclat.next().charAt(0); //guarda una sola lletra introduint el teclat

        System.out.print("Numero enter1: ");
        int num1=teclat.nextInt();
        System.out.print("Numero enter2: ");
        int num2=teclat.nextInt();


        if (caracter=='+'){
            System.out.println(num1+num2);
        }
        else{
            if (caracter=='-'){
                System.out.println(num1-num2);
            }
            else{
                if (caracter=='*'){
                    System.out.println(num1*num2);
                }
                else{
                    if (caracter=='/'){
                        System.out.println(num1/num2);
                    }
                }
            }
        }




    }
}