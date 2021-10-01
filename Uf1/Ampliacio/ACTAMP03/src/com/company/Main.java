package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int b=1,d=0, e=0;
        System.out.print("Entra un número: ");
        int a= teclat.nextInt();
        while(b<a){
            int c = a%b;
            System.out.println(a+" % "+b+" = "+c);



            if(c==0){
                d=d+b;

            }
            if (d==a){
                e=1;
            }
            else{
                e=0;
            }
            b++;
        }
        if (e==1){
            System.out.println("Es perfecto");
        }
        else{
            System.out.println("Inperfecto");
        }




    }

}
