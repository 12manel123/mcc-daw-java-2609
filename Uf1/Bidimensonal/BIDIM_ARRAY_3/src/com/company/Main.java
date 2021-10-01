package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][5];
        int g=0;
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(100);
                if (i%2!=0){
                    g=g+array[i][j];
                }
            }
        }
        for(int i = 0; i < 4; i++) {
            System.out.print("Fila " + i + " { ");
            for (int j = 0; j < 5; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("}");
        }
        System.out.println("Suma: "+g);
    }
}
