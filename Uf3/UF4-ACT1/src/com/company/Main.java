package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner teclat = new Scanner(System.in);
        GuessNumber joc = new GuessNumber();
        System.out.println(joc.getMinValor());
        System.out.println(joc.getMaxValor());
        System.out.println(joc.getMissatge());

        boolean fi = false;
        while (!fi) {
            boolean fiJoc = false;
            while (!fiJoc) {
                System.out.println("Entra num: ");
                int numero = teclat.nextInt();
                fiJoc = joc.comprova(numero);
                System.out.println(joc.getMissatge());
            }
            joc.reiniciar();
            System.out.println("Vols tornar a jugar?: (s/n) ");
            char opcio = teclat.next().charAt(0);
            if (opcio=='n') fi=true;
        }
    }
}
