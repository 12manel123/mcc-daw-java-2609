package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Entra num : ");
        int a = teclat.nextInt();
        int b=a;
        int c=0;
        while (a!=0){
            b=a%10;
            if (b==1|b==0){
            }
            else{
                c=1;
            }
            a=a/10;
        }
        if (c==1){
            System.out.println("No es binario");
        }
        else{
            System.out.println("Es binario");
        }
    }
}

