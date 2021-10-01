package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Text: ");
        String a = teclat.next();
        int b=1;
        while (b<=10){
            System.out.println(a);
            b++;
        }
    }
}