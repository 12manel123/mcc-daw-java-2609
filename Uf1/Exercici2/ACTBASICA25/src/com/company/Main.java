package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Nota alumne: ");
        double nota=teclat.nextDouble();

        if (nota<5){
            System.out.println("Insuficient: "+nota);
        }
        else{
            if (nota<6){
                System.out.println("Suficient: "+nota);
            }
            else{
                if (nota<7){
                    System.out.println("Be: "+nota);
                }
                else{
                    if (nota<9){
                        System.out.println("Notable: "+nota);
                    }
                    else{
                        if (nota<10){
                            System.out.println("Exelent: "+nota);
                        }
                    }
                }
            }
        }

    }
}