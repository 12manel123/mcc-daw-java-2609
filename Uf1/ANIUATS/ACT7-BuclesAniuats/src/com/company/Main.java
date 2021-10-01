package com.company;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[21];
        int contar = 0;
        int b=0;
        while (contar < 100) {
            a[random.nextInt(21)]++;
            contar++;
        }
        contar = 0;
        while (contar < a.length) {
            System.out.print("Peso " + (30+contar) + ": ");
            b=a[contar];
            while (b>=0){
                System.out.print("█");
                b--;
            }
            System.out.println("");
            contar++;
        }
    }
}