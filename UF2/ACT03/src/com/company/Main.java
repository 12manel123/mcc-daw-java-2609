package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main deitu = new Main();
        Scanner teclat = new Scanner(System.in);

        // Inicializar los dos vectores

        int[]juego = new int[6];
        int[]resultado = new int[6];

// Introducir los números que vamos a jugar

        System.out.println("Introduce seis números (sin repetir) entre el 1 y 49");

        deitu.inicialitzarVectorDiferentsTeclat(juego);

        //Generar el resultado

        deitu.inicialitzarVectorDiferentsAleatoris(resultado);

        // Mostrar los dos vectores

        System.out.println("Estos son tus números: ");
        deitu.imprimir(juego);
        System.out.println();

        System.out.println("Estos son los números ganadores: ");
        deitu.imprimir(resultado);
        System.out.println();

        // Mostrar el número de aciertos

        System.out.println("Has acertado "+deitu.numRepetitsVectors(juego, resultado)+" números en total");

    }

    /**
     * Implementar una funció anomenada numeroAleatoriLoteria
     * que retorni un enter aleatori comprès entre 1 i 49.
     */

    int numeroAleatoriLoteria(int minim, int maxim) {

        Random random = new Random();

        int num = random.nextInt(maxim - 1) + minim;

        return num;
    }

    /**
     * Implementar una funció anomenada cercaNumero que retorna cert si un número passat
     * per paràmetre es troba dins d’un vector també passat per paràmetre.
     */

    boolean cercaNumero(int numero, int vector[]) {

        boolean esta = false;

        for (int i = 0; i < vector.length; i++) {
            if (numero == vector[i]) esta = true;
            else esta = false;
        }
        return esta;
    }

    /**
     * Implementar una funció que inicialitzi per teclat un vector de números de forma que
     * tots siguin diferents.
     */

    void inicialitzarVectorDiferentsTeclat(int vector[]){

        Scanner teclat = new Scanner(System.in);
        boolean esta = false;
        int i = 0;

        while (i<vector.length) {
            esta = false;
            System.out.println("Introduce el "+(i+1)+" número: ");

            vector[i] = teclat.nextInt();

            int x = 0;

            while (x<vector.length){

                if(vector[i] == vector[x] && x != i) {
                    System.out.println("Este número ya se ha introducido.");
                    esta = true;
                    break;
                }
                if (vector[i] < 0 || vector[i] > 49) {
                    System.out.println("Solo números entre 1 y 49");
                    esta = true;
                    break;
                }
                x++;
            }
            if (!esta) {
                i++;
            }
        }
    }

    /**
     * Implementar una funció que inicialitzi aleatòriament un vector de números de forma que
     * tots siguin diferents.
     */

    void inicialitzarVectorDiferentsAleatoris(int vector[]){

        Random random = new Random();

        boolean esta = false;
        int i = 0;

        while (i<vector.length) {
            vector[i] = random.nextInt(48) + 1;
            esta = false;
            int j = 0;
            while (j < vector.length) {

                if (vector[i] == vector[j] && j != i) {
                    esta = true;
                    break;
                }
                j++;
            }
            if (!esta) {
                i++;

            }
        }
    }

    /**
     * Implementar una funció que tingui un paràmetre per indicar la forma d’inicialitzar el
     * vector de números. Si el paràmetre és «teclat» els recull del teclat. Si el paràmetre és
     * «aleatori» genera els números aleatòriament.
     */

    void inicialitzarVectorDiferents(int vector[], String forma){

        if (forma.equalsIgnoreCase("teclat")) {
            inicialitzarVectorDiferentsTeclat(vector);
        } else if (forma.equalsIgnoreCase("aleatori")) {
            inicialitzarVectorDiferentsAleatoris(vector);
        } else System.out.println("Incorrecta");
    }

    /**
     * - Implementar una funció que passats dos vectors ens retorni la quantitat de números
     * del primer vector que es troben dins el segon vector. Utilitzar la funció cercaNumero.
     */

    int numRepetitsVectors(int vector1[], int vector2[]){

        int i = 0;
        int aciertos = 0;

        while (i < vector1.length) {
            int j = 0;
            while (j < vector2.length) {
                if (vector1[i] == vector2[j]) aciertos++;
                j++;
            }
            i++;
        }
        return aciertos;
    }

    // Imprimir el vector:

    void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }

}
