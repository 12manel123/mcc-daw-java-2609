package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        System.out.print("Entra un text: ");
        String paraula=teclat.nextLine();
        int i,b=0,d=0;
        char[] p = paraula.toCharArray();
        while (b<p.length){
            if (p[b]=='a'|p[b]=='e'|p[b]=='i'|p[b]=='o'|p[b]=='u') {d++;}
            b++;
        }
        System.out.print("Te "+d+" vocals");
    }
}
