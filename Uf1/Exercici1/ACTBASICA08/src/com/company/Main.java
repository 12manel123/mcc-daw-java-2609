package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int costatGran = (int) teclat.nextDouble();
        int costatPetit = (int) teclat.nextDouble();
        System.out.println(("Perimetre:")+((costatGran*2)+(costatPetit*2)));
        System.out.println("Àrea:"+(costatGran*costatPetit));

    }
}