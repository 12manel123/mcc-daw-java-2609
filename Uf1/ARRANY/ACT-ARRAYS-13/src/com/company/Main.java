package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra un text: ");
        String paraula=teclat.nextLine();
        int i,b=0,d=0;
        char[] p = paraula.toCharArray();
        System.out.print("Entra un caràcter: ");
        int c = teclat.next().charAt(0);
        i=p.length;
        while (b<i){
            if (p[b]==c){
                d=1;
            }
            b++;
        }
        if(d==1) {
            System.out.println("El caracter esta dints de la cadena");
        }
    }
}
