package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int b, a = 0;

            System.out.print("Entra número: ");
            b = teclat.nextInt();

            while (b > 0) {
                if (b % 10 == 2) {
                    a++;
                }

                System.out.print("Entra número: ");
                b = teclat.nextInt();
            }
            System.out.println("Has entrat " + a + " números acabats en 2");
        }
    }

