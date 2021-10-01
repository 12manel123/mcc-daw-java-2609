package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int[] a =new int [5];
        int i = 0;
        while (i<a.length){
        	System.out.print("Entra valor de posició "+i+": ");
        	a[i] = teclat.nextInt();
        	i=i+1;
        }
        System.out.println("Has entrat els següents valors: "+a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);
        System.out.println("La suma dels valors és: "+(a[0]+a[1]+a[2]+a[3]+a[4]));
        double c=((a[0]+a[1]+a[2]+a[3]+a[4])/a.length);
        System.out.println("La mitjana és: "+c);
        i = 0;
        System.out.print("Els valors mes petits que la mitjana són: ");
        while (i<a.length){
            if (a[i]<c){
                System.out.print(a[i]+" ");
            }
            i=i+1;
        }
        System.out.println("");
        i = 0;
        System.out.print("Els valors mes grans que la mitjana són: ");
        while (i<a.length){
            if (a[i]>c){
                System.out.print(a[i]+" ");
            }
            i=i+1;
        }
    }
}