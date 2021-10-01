package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        int a=0;



        while(a>=5){
            int b = teclat.nextInt();
            System.out.println(b);
            a=a+1;
        }


    }
}