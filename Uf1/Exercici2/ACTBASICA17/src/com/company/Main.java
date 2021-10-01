package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Homes: ");
        int homes = teclat.nextInt();
        System.out.print("Dones: ");
        int dones = teclat.nextInt();

        int total = (homes+dones);
        int mitjanah = (homes*100/total);
        System.out.println(mitjanah+"% de homes");
        int mitjanad = (dones*100/total);
        System.out.println(mitjanad+"% de dones");

        if (mitjanah>=mitjanad){
            if (mitjanah==50){
                System.out.println("Hi han les mateixes");
            }
            else {
                System.out.println("Hi ha més homes");
            }

        }
        else{
            System.out.println("Hi ha més dones");

        }
    }
}