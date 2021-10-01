package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Loteria lot = new Loteria();
        Scanner teclat=new Scanner(System.in);
        int[]aposta=new int[6];


        //Fer apostes:
        System.out.println("Numeros del 1 fins el 49 sense repetir");
        int cont1=0;
        while (cont1<aposta.length){
            System.out.print((cont1+1)+"º numero a apostar: ");
            int num =teclat.nextInt();
            aposta[cont1]=num;
            cont1++;
        }


        //Verificar les apostes:
        lot.setApostes(aposta);


        //Crear 6 nums aleatoris:
        lot.sortejar();



        //Sorteig final:
        System.out.println();
        System.out.println("Numeros guanyadors: "+Arrays.toString(lot.getAleatoris()));
        System.out.println("Numeros apostats: "+Arrays.toString(lot.getApostes()));
        System.out.println("Encertats: "+lot.numeroEncerts());

    }


}
