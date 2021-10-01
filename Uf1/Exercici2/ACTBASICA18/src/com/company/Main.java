package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a;
        System.out.print("Fica el numero:");
        a=teclat.nextInt();
        if(a<=0){
            if (a==0){
                System.out.println("es 0");
            }
            else {
                System.out.println("es negatiu");
            }
        }

        else{
            System.out.println("es positiu");
        }


    }
}
