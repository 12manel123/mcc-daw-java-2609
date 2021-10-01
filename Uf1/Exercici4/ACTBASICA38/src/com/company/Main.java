package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(15)+1;
        int a=0;
        System.out.print("Introdueix nombre de vegades: ");
        int b = teclat.nextInt();

        System.out.print("Introdueix nombre maxim de aletorietat: ");
        int c = teclat.nextInt();



        while(a<b){
            num = random.nextInt(c)+0;
            System.out.println(num);

            if (num%2==0){
                System.out.println("Parell");
            }
            else{
                System.out.println("Imparell");
            }
            a=a+1;
        }


    }
}
