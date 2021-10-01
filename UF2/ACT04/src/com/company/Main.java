package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main programa = new Main();

        char[][] matriu = {
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X'}
        };

        programa.generaZeros(matriu);
        programa.jugar(matriu);
        Scanner scanner = new Scanner(System.in);
        int numero2 = 0;
        programa.llegirNumero(scanner, numero2);
    }

    /**
     * Posa aleatòriament zeros a 5 posicions de la matriu
     *
     * @param matriu una matriu de caràcters que representa el tauler
     */
    void generaZeros(char[][] matriu) {
        Random random = new Random();
        int o = 0;
        while (o < 5) {
            int a = random.nextInt(5);
            int r = random.nextInt(5);
            matriu[a][r] = 'O';
            o++;
        }
    }

    /**
     * Amb el tauler passat com a paràmetre, demana com a màxim 8 cops
     * fila i columna a l'usuari. Un cop exhaurides les 8 tirades o trobats
     * els 5 zeros acaba
     *
     * @param
     */


    void jugar(char[][] matriu) {
        //
        Scanner teclat = new Scanner(System.in);
        int v = 0;
        while (v < 10) {
            System.out.print("Introdueix fila: ");
            int n = teclat.nextInt();
            System.out.print("Introdueix columa: ");
            int m = teclat.nextInt();
            if (matriu[n][m] == 'O') {
                matriu[n][m] = 'D';
                System.out.println("Li has donat");


            }
            else {
                System.out.println("Thas equivocat");
            }
            v++;
            imprimir(matriu);
        }

    }




    /**
     * Imprimeix el tauler de joc. Només s'imprimeix zeros si l'usuari els ha
     * trobat. Si un zero s'ha trobat hi haurà emmagatzemada una 'D' de descobert
     * @param matriu la matriu de caràcters que representa el tauler
     */
    void imprimir(char[][] matriu) {

        for(int i = 0; i < matriu.length; i++) {
            System.out.print("Fila " + i + " { ");
            for (int j = 0; j < matriu.length; j++) {
                if(matriu[i][j]=='D')
                    System.out.print("O ");
                else System.out.print("X ");
                //System.out.print(matriu2[i][j] + " ");
            }
            System.out.println("}");
        }

    }

    /**
     * Demana a l'usuari un número que sigui correcte. Si no ho és el
     * demana fins que sigui correcte.
     * @param entrada un escaner amb l'entrada de dades des del teclat
     * @param maxim un enter per indicar que el número és correcte si està entre 0 i màxim per exemple
     * @return la fila o columna introduida per l'usuari
     */
    int llegirNumero(Scanner entrada, int maxim) {
        int numero = entrada.nextInt();
        numero = -1;
        maxim =5;
        return numero;
    }



}

