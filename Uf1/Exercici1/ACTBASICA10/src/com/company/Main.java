package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Capital:");
        int c= (int) teclat.nextInt();
        System.out.print("Taxa d'interès:");
        int r= (int) teclat.nextInt();
        System.out.print("Període de càlcul en dies:");
        int t= (int) teclat.nextInt();

        double l = ((c * r * t) / (360*100));
        System.out.println(l);
    }
}
