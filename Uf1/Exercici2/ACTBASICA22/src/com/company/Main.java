package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix num1: ");
        int numu=teclat.nextInt();
        System.out.print("Introdueix num2: ");
        int numd=teclat.nextInt();
        int z;

        if (numu>numd){
            z=numu;
            System.out.println("Z = "+z);
        }
        else{
            z=numd;
            System.out.println("Z = "+z);
        }



    }
}