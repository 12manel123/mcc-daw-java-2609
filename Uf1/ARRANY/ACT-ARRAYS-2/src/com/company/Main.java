package com.company;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] a =new int [20];
        int b=0;
        while (b<a.length){
            a[b]= random.nextInt(10);
            b++;
        }
        System.out.println(Arrays.toString(a));
        b=0;
        int c=0;
        while(b<a.length){
            c=c+a[b];
            b++;
        }
        System.out.println("La suma és: "+c);
        int d=c/a.length;
        System.out.println("La mijana és: "+d);
        b=0;
        System.out.print("Valors mes grans a la mitjana: ");
        while (b<a.length){
            if (a[b]>d){
                System.out.print(a[b]+" ");
            }
            b++;
        }
        System.out.println("");
        b=0;
        System.out.print("Valors mes petits a la mitjana: ");
        while (b<a.length){
            if (a[b]<d){
                System.out.print(a[b]+" ");
            }
            b++;
        }
    }
}