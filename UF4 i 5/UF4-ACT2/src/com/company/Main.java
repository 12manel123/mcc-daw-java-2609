package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Main programa = new Main();
        Scanner teclat = new Scanner(System.in);

        Caixer caixer = new Caixer();

        while(true) {
            System.out.println("Entra el teu nom:");
            String nom = teclat.next();
            System.out.println("Entra el teu password:");
            String password = teclat.next();
            boolean correcte = caixer.iniciaSessio(nom,password);
            System.out.println(caixer.getMissatge());

            // podem provar de treure diners si usuari incorrecte?!
            // caixer.ingressarDinersUsuari(100);
            // System.out.println(caixer.getMissatge());

            if (correcte) {
                programa.menu();
                int opcio = teclat.nextInt();
                while(opcio!=5) {
                    switch (opcio) {
                        case 1:
                            double diners = caixer.consultaSaldoUsuari();
                            System.out.println(diners);
                            break;
                        case 2:
                            System.out.println("Quina quantitat vols ingressar?");
                            double quantitatI = teclat.nextDouble();
                            caixer.ingressarDinersUsuari(quantitatI);
                            System.out.println(caixer.getMissatge());
                            break;
                        case 3:
                            System.out.println("Quina quantitat vols retirar?");
                            double quantitatT = teclat.nextDouble();
                            caixer.retirarDinersUsuari(quantitatT);
                            System.out.println(caixer.getMissatge());
                            break;
                        case 4:
                            System.out.println("Nou password:");
                            password = teclat.next();
                            caixer.canviarClauUsuari(password);
                            break;
                        default:
                            System.out.println("Operació incorrecta!");
                    }
                    programa.menu();
                    opcio = teclat.nextInt();
                }

            }
        }
    }

    public void menu() {
        System.out.println("Que vols fer?");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Ingressar diners");
        System.out.println("3. Treure diners");
        System.out.println("4. Canviar password");
        System.out.println("5. Sortir");

    }
}
