package com.company;
public class Main {
    public static void main(String[] args) {
        int a,b=1;
        char c='*';
        while (b<=9){
            a=1;
            while (a<=b){
                System.out.print(c+" ");
                a++;
            }
            b++;
            System.out.println("");
        }
    }
}