package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][15];
        int g=0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 15; j++) {
                array[i][j] = random.nextInt(10);
                    g=g+array[i][j];

            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.print("Classe " + (i+1) + " { ");
            for (int j = 0; j < 15; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("}");
        }
        System.out.println("Mirjana: "+(g/45));
    }
}
