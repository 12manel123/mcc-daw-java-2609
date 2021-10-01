package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int[][] array = new int[10][10];
        int g=1;
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = g;
                g++;
            }
        }
        for(int i = 0; i < 10; i++) {
        System.out.print("Fila " + i + " { ");
        for (int j = 0; j < 10; j++)
            System.out.print(array[i][j] + " ");
        System.out.println("}");
    }
    }
}
