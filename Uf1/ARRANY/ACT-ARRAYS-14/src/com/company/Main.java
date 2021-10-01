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
        System.out.print("El caràcter a es troba en les posicions: ");
        while (b<i){
            if (p[b]==c){
                d++;
                System.out.print(b+" ");
            }
            b++;
        }
        System.out.println("");
        System.out.print("Surt "+d+" cops");
    }
}