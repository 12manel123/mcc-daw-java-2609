package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();

        // Variables comuns a tots els mètodes
        // Array on es guarden les notes
        double[] notes = new double[40];
        // numNotes guarda la quantitat de notes introduïdes actualment
        int numNotes = 0;

        String opcio = programa.menu();

        while ( !opcio.equalsIgnoreCase("FI") ) {
            switch ( opcio.toUpperCase() ) {
                case "RT":
                    numNotes = programa.registrarNotes(notes, numNotes);
                    break;
                case "MJ":
                    System.out.println("La nota mitjana és " + programa.mitjana(notes, numNotes) );
                    break;
                case "HT":
                    programa.histograma(notes, numNotes);
                    break;
                case "FI":
                    //Sortir.
                default:
                    System.out.println("Aquesta opció no és vàlida");
            }
            System.out.println("");
            opcio = programa.menu();

        }

    }

    String menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Gestor de notes");
        System.out.println("---------------");
        System.out.println("[RT] Registrar notes.");
        System.out.println("[MJ] Consultar nota mitjana.");
        System.out.println("[HT] Histograma de notes.");
        System.out.println("[FI] Sortir.");
        System.out.print("Què vols fer?: ");

        return entrada.next();
    }

    int registrarNotes(double[] notes, int numNotes) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix les notes. Indica -1 per a finalitzar.");
        int e=0;
        while (e>-1){
            e=entrada.nextInt();
            if (e!=-1){
                notes[numNotes]=e;
            }
            numNotes++;
        }
        return numNotes-1;
    }

    double mitjana(double[] notes, int numNotes) {
        int numNotes2=numNotes;
        double resultat=0;
        while (numNotes>=0){
            resultat=resultat+notes[numNotes];
            numNotes--;
        }
        return resultat/numNotes2;
    }

    void histograma(double[] notes, int numNotes) {
        int[] histograma = new int[4];
        int a=0;
        while(a<numNotes){
            if (notes[a]<5){ histograma[0]=histograma[0]+1; }
            else{ if (notes[a]<6){ histograma[1]=histograma[1]+1; }
                else{ if (notes[a]<8){ histograma[2]=histograma[2]+1; }
                    else { histograma[3]=histograma[3]+1; } } }
            a++;
        }
        a=0;
        int g=0;
        while(a<4){
            if (a==0){ System.out.print("Suspes: "); }
                else{ if(a==1){ System.out.print("Aprovat: "); }
                    else{ if(a==2){ System.out.print("Notable: "); }
                      else{ System.out.print("Exelent: "); } } }
            while (g<histograma[a]){
                System.out.print("* ");
                g++;
            }
            System.out.println("");
            g=0;
            a++;
        }


        // Generem l'histograma comptant quants suspesos, aprovats, be, notable
        //i excel·lents hi ha

        // ...

        //Imprimim l'histograma

        // ...
    }
}