package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a=0,b=1,c=0;


        while(b<3){
        System.out.print("Entra un número: ");
        a= teclat.nextInt();

        if (c==a){
            b++;
        }
        else{
            b=1;
        }
        c=a;
        }
        System.out.println("Has entrat 3 cops seguits el número "+a+". Adeu");


    }

}
