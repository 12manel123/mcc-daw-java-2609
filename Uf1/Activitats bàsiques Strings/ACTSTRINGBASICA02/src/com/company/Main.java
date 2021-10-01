package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);


        int b=1;
        while (b<=10){
            System.out.print("Text: ");
            String a = teclat.next();
            System.out.println(a.length());
            b++;
        }
    }
}
