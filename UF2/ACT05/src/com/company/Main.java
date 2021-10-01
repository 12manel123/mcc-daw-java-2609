package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main programa = new Main();

        String [] matriu = {"","","","","","",""};



        int lan =0;
        while (lan!=5){
            lan = programa.triaOpcio(matriu);
            if (lan==1){ programa.aparcar(matriu); }
            if (lan==2){ programa.marxar(matriu); }
            if (lan==3){ programa.mostrarMenu(matriu); }
            if (lan==4){ programa.cercar(matriu); }
        }
    }

    void mostrarMenu(String[] matriu) {
        System.out.println(Arrays.toString(matriu));
    }

    int triaOpcio(String[] matriu) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Elexeix entre Aparcar(1), Marxar(2),Mostrar(3),Cercar(4) i Fi(5): ");
        int n = teclat.nextInt();
        return n;
    }

    void aparcar(String[] matriu) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Elexeix lloc on aparcaras: ");
        int p = teclat.nextInt();
        int f=0;
        while (f==0){
            if (p<0||p> matriu.length|| !matriu[p].equals("")){
                System.out.print("Torna a escriure el numero: ");
                p = teclat.nextInt();
            }
            else{f=1;}
        }
        System.out.print("Escriu el teu num de matricula: ");
        String m = teclat.next();
        matriu[p]=m;
    }
    void marxar(String[] matriu) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("On estaves aparcat?: ");
        int p = teclat.nextInt();
        matriu[p]="";
    }
    void cercar(String[] matriu) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Num de matricula?: ");
        String p = teclat.next();
        int t=0,tt=0;
        while (t<matriu.length&&tt!=1){
            if (matriu[t].equals(p)){
                System.out.println("S'ha trovat, és en la: "+t);
                tt=1;
            }
            else{t++; }
        }
        if (tt==0){
            System.out.println("No s'ha trobat");
        }

    }




}
