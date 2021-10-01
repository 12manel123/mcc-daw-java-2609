package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        String[] dies = {"dilluns","dimarts","dimecres","dijous","divendres","dissabte","diumenge"};
        String[] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        String paraule =teclat.nextLine();
        int b=0;
        while (b<=6){
            if (paraule.equals(dies[b])){
                System.out.println(dias[b]);
            }
            b++;
        }
    }
}