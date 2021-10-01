package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(15)+1;
        int a=0;



        while(a<50){
            num = random.nextInt(15)+1;
            System.out.println(num);
            a=a+1;
        }
        

    }
}
