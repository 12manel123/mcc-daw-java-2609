package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Segons:");
        int segons= (int) teclat.nextInt();

        int hores = (segons / 3600);
        int minuts = ((segons - ((hores*60)*60))/60);
        int segonscal = (segons - ((hores*3600)+(minuts*60)));
        System.out.println("Hores: "+hores);
        System.out.println("Minuts: "+minuts);
        System.out.println("Segons: "+segonscal);
    }
}
