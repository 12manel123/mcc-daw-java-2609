package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclat = new Scanner(System.in);
        char [][] array = new char[5][5];
        char [][] array2 = new char[5][5];
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array2[i][j] = 'X';
            }
        }
        for(int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                array[i][j] = 'X';
            }
        }
        int b=0,o=0;

        while (b<5){

            for(int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = 'X';
                }
            }



            b++;
        }
        while(o<5){
            int a=random.nextInt(5);
            int r=random.nextInt(5);
            array[a][r]='O';
            o++;
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print("Fila " + i + " { ");
            for (int j = 0; j < array.length; j++)
                System.out.print(array2[i][j] + " ");
            System.out.println("}");
        }

        int v=0,c=0,d=0;
        while (v<8) {
            System.out.print("Introdueix fila: ");
            int n= teclat.nextInt();
            System.out.print("Introdueix columa: ");
            int m= teclat.nextInt();
            if (array[n][m] == 'O') {
                System.out.println("Li has donat");
                d++;
                array2[n][m]='O';
            }
            else{
                System.out.println("Thas equivocat");
                c++;
            }
            v++;
            for(int i = 0; i < array.length; i++) {
                System.out.print("Fila " + i + " { ");
                for (int j = 0; j < array.length; j++)
                    System.out.print(array2[i][j] + " ");
                System.out.println("}");
            }
        }
        System.out.println("Has acertat "+d+" cops, i has fallat "+c+" vegades");

    }
}
