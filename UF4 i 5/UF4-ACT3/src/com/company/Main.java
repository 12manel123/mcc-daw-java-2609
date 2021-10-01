package com.company;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Parking p = new Parking(5);
        p.llistat();
        System.out.println("Places lliures : "+ p.numPlacesLliures());
        if ( p.aparcar("1234AB")) System.out.println("Aparcat correctament");
        if ( p.aparcar("2345BC")) System.out.println("Aparcat correctament");
        if ( p.aparcar("3456CD")) System.out.println("Aparcat correctament");
        if ( p.aparcar("4567DE")) System.out.println("Aparcat correctament");
        if ( p.aparcar("5678EF")) System.out.println("Aparcat correctament");

        if ( p.aparcar("6789FG")) System.out.println("Aparcat correctament");
        p.llistat();
        System.out.println("Places lliures : "+ p.numPlacesLliures());

        // aturo el programa 2 segons per a que els cotxes hi estiguin aparcats 2 segons
        TimeUnit.SECONDS.sleep(2);

        double preu = p.desaparcar("3456CD");
        System.out.println("A pagar: "+preu);

        // aturo el programa 3 segons per a que els cotxes hi estiguin aparcats 3 segons més!
        TimeUnit.SECONDS.sleep(3);

        preu = p.desaparcar("5678EF");
        System.out.println("A pagar: "+preu);
        p.llistat();
        if ( p.aparcar("6789FG")) System.out.println("Aparcat correctament");
        p.llistat();
        System.out.println("Places lliures : "+ p.numPlacesLliures());
    }
}
