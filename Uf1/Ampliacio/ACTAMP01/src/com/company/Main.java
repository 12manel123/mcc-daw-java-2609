package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a,b,c,d;
        c=0;

        System.out.print("Operand 1: ");
        a= teclat.nextInt();
        System.out.print("Operand 2: ");
        b = teclat.nextInt();
        d=b;
        int e=d;
        while(0<b){
            c = c+a;
            b--;
        }
        while(0<d){
            System.out.print(a+" + ");
            d--;

        }
        System.out.println(" = "+c+" (s’ha sumat el primer número "+ e +" vegades)");

    }

}
