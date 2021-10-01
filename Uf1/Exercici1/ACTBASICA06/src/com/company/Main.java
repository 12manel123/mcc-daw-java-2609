package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int temperatureF = (int) teclat.nextDouble();
        int TemperatureC = ((temperatureF -32)*5)/9;
        System.out.println(TemperatureC);


    }
}