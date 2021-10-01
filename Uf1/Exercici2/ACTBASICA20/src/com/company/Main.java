package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Cuantitat N:");
        int N=teclat.nextInt();

        if(N<500){
            System.out.println(N-(N*5/100));
        }
        else{
            if (N>=500 && N< 1000){
                System.out.println(N-(N-(N*8/100)));
            }
            else {
                if (N>=1000 && N<=5000){
                    System.out.println(N-(N-(N*15/100)));
                }
                else {
                    if (N>5000){
                        System.out.println(N-(N-(N*25/100)));
                    }
                }
            }
        }


    }
}
