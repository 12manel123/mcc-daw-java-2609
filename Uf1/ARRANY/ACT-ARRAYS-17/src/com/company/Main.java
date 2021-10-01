package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        String[] ciutat = {"","Tarragona","Altafulla","Torredembarra","Creixell","Roda de Barà","El Vendrell"};
        int[] km = {0,14,3,8,5,10,0};
        System.out.print("Origen: ");
        int origen=teclat.nextInt();
        System.out.print("Destí: ");
        int desti=teclat.nextInt();
        char at;
        System.out.print("Anada/Tornada(s/n)?: ");
        at=teclat.next().toLowerCase().charAt(0);
        System.out.println("");
        System.out.println("Origen: "+ciutat[origen]);
        System.out.println("Destí: "+ciutat[desti]);
        System.out.print("Km: ");
        int a=desti-origen;
        int b=0;
        int c=0;
        int d=origen;
        while (a>b){
            c= km[d]+c;
            d++;
            b++;
        }
        System.out.println(c);
        double e=c;
        System.out.print("A/T: ");
        if (at=='s'){
            System.out.println("Si");
            System.out.println("Descompte: 5%");
            System.out.print("Preu: "+(2*((e*0.08)-((e*0.08)*0.05)))+" €");
        }
        else{
            System.out.println("No");
            System.out.print("Preu: "+(e*0.08)+" €");
        }

    }
}