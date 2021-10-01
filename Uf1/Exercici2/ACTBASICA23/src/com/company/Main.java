package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix una quantitat (cèntims euro): ");
        if (teclat.hasNextDouble()){
            int centims = teclat.nextInt();
            if (centims<0){
                System.out.println("Es mes petit que 0");
            }
            else {
                int doseu = centims / 200;
                int reste = centims % 200;
                System.out.println(doseu + " monedes de 2€");

                int uneu = (reste / 100);
                reste = reste % 100;
                System.out.println(uneu + " monedes de 1€");

                int cincquantacent = (reste / 50);
                reste = reste % 50;
                System.out.println(cincquantacent + " monedes de 50 cèntims");

                int vintcent = (reste / 20);
                reste = reste % 20;
                System.out.println(vintcent + " monedes de 20 cèntims");

                int deucent = (reste / 10);
                reste = reste % 10;
                System.out.println(deucent + " monedes de 10 cèntims");

                int cinccent = (reste / 5);
                reste = reste % 5;
                System.out.println(cinccent + " monedes de 5 cèntims");

                int doscent = (reste / 2);
                reste = reste % 2;
                System.out.println(doscent + " monedes de 2 cèntims");

                int uncent = (reste / 1);
                reste = reste % 1;
                System.out.println(uncent + " monedes de 1 cèntims");
            }
        }
        else{
            System.out.println("No es enter");
        }


    }
}
