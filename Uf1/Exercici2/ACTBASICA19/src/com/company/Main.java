package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a,b;
        System.out.print("Fica el numero1:");
        a=teclat.nextInt();
        System.out.print("Fica el numero2:");
        b=teclat.nextInt();

        if(a<=b){
            if (a==b){
                System.out.println("Son iguals");
            }
            else {
                System.out.println("El 2 es mes gran");
            }
        }

        else{
            System.out.println("El 1 es mes gran");
        }


    }
}

