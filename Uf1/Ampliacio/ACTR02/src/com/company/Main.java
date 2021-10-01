package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Entra lletra: ");
        char a = teclat.next().charAt(0);
        char b = 'a';

        while (b<=a){
            System.out.print(b+" ");
            b= (char) (b+1);
        }




    }

}
