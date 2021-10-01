package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a=0,b;

        while (a<=21) {

            System.out.print("Entra num: ");
            b = teclat.nextInt();
            if (b<=5&&b>0){
                a = a + b;
            }
            else{
                System.out.println("El número no es correcte");
            }


        }
        System.out.println("Més de 21! La suma dels números entrats és "+a);
    }

}
