package com.company;
public class Main {
    public static void main(String[] args) {
        int a,b=9;
        char c='*';
        while (b>=1){
            a=1;
            while (a<=b){
                System.out.print(c+" ");
                a++;
            }
            b--;
            System.out.println("");
        }
    }
}
