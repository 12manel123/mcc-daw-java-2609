package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        Scanner teclat = new Scanner(System.in);

        Test test = new Test();

        int menu=0;
        int resposta=0;
        while (menu!=4){
            programa.mostrarPregunta(
                    test.getNumeroPregunta(),
                    test.getEnunciatPreguntaActual(),
                    test.getRespostesPreguntaActual());

            System.out.print("1.Enrerre 2.Respondre 3.Endavant 4.FIN: ");
            menu = teclat.nextInt();
            if (menu==1){
                test.anarEndarrera();
            }
            else{if (menu==2){
                System.out.print("Resposta: ");
                resposta= teclat.nextInt();
                test.respondre(resposta);
            }
            else{
                test.anarEndavant();
            }
                System.out.println();

            }

        }
        System.out.println("Punts: "+test.solucionarTest());

    }
    public void mostrarPregunta(int posicio, String enunciat, String[] respostes) {
        System.out.print("Pregunta " + posicio + ". ");
        System.out.println(enunciat+":");
        for (int i = 0; i < respostes.length; i++) {
            System.out.println("  " + (i + 1) + "." + respostes[i]);
        }
    }
}
