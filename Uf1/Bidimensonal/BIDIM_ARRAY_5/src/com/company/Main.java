package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclat = new Scanner(System.in);
        int a = random.nextInt(18)+2;
        int[][] array = new int[a][a];
        int c=0;
        System.out.print("Buscar: ");
        int b=teclat.nextInt();
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j]=random.nextInt(100);
                if (array[i][j]==b){
                    c++;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print("Fila " + i + " { ");
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("}");
        }
        System.out.println("Sha trobat "+c+" cerques");
    }
}
