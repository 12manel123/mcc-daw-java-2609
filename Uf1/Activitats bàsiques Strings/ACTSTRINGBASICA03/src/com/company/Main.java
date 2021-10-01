package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int b=0;
        while (b==0){
            System.out.print("Text: ");
            String a = teclat.next();
            if ( a.equals("fi")) {
                b=1;
            }
            else{
                b=0;
            }
        }

    }
}