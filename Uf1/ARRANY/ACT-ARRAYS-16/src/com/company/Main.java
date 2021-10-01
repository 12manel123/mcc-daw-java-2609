package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int b=0;
        System.out.print("Entra un text: ");
        String paraula=teclat.nextLine();
        char[] p = paraula.toCharArray();
        if (p.length>8){
            System.out.println("Massa gran");
        }
        if (p[4] != '-'){
            System.out.println("Incorrecte, no has introduit -");
        }
        while (b<=3){
            if (((p[b] >= 'a' && p[b] <= 'z') || (p[b] >= 'A' && p[b] <= 'Z'))) {
                System.out.println("Pocició "+b+" incorrecte (ha de ser numero)");
            }
            b++;
        }
        b=5;
        while (b<=7){
            if (!((p[b] >= 'a' && p[b] <= 'z') || (p[b] >= 'A' && p[b] <= 'Z'))) {
                System.out.println("Pocició "+b+" incorrecte (ha de ser lletra)");
            }
            b++;
        }

    }
}