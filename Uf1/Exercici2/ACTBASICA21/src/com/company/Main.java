package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el codi de l'article: ");
        int codi=teclat.nextInt();
        System.out.print("Introdueix la quantitat: ");
        int quantitat=teclat.nextInt();
        System.out.print("Introdueix el preu de l'article: ");
        int preu=teclat.nextInt();

        System.out.println("Article "+codi);
        System.out.println("Quantitat "+quantitat);
        System.out.println("Preu "+preu);

        if (quantitat>=100){
            System.out.println("Descompte %40");
            System.out.println("Total "+(preu-(preu*40/100)));
        }
        else {
            if (quantitat>=25 && quantitat <100 ){
                System.out.println("Descompte %20");
                System.out.println("Total "+(preu-(preu*20/100)));
            }
            else{
                if (quantitat>=10 && quantitat <24 ){
                    System.out.println("Descompte %10");
                    System.out.println("Total "+(preu-(preu*10/100)));
                }
                else{
                        System.out.println("Descompte %0");
                        System.out.println("Total "+preu);
                }
            }
        }

    }
}
