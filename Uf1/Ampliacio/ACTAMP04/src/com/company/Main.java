package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();
        int b=0;
        double d=0;
        System.out.print("Diners apostats: ");
        int f = teclat.nextInt();
        while(b==0){


            double num = random.nextInt(10)+1;
            if (num==8|num==9|num==10){
                num=0.5;
            }
            System.out.println(num);
            System.out.print("Planta(1) o nova?(0): ");
            int c = teclat.nextInt();
            if (c==0){

                d=d+num;
            }
            else{
                b=1;
                System.out.println("El jugador es planta");
            }
        }
        if (d==7.5){
            System.out.println("Has guanyat"+(f*2)+"euros.");
        }
        else{
            if (d<7.5){
                System.out.println("Recuperes diners");
            }
            else{
                System.out.println("Has perdut");
            }

        }



    }
}
