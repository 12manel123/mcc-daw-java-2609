package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix una quantitat (cèntims euro): ");
        int centims= teclat.nextInt();

        int doseu = (centims/200);
        System.out.println(doseu +" monedes de 2€");

        int uneu = (((centims)-(doseu*200))/100);
        System.out.println(uneu +" monedes de 1€");
        //mirar while comando
        int cincquantacent = (((centims)-(doseu*200))/50);
        System.out.println(cincquantacent +" monedes de 50 cèntims");

        int vintcent = ((((centims)-(doseu*200))-(cincquantacent))/20);
        System.out.println(vintcent +" monedes de 20 cèntims");

        int deucent = (centims);
        System.out.println(deucent +" monedes de 10 cèntims");

        int cincent = (centims);
        System.out.println(cincent +" monedes de 5 cèntims");

        int doscent = (centims);
        System.out.println(doscent +" monedes de 2 cèntims");

        int uncent = (centims);
        System.out.println(uncent +" monedes de 1 cèntims");

    }
}
