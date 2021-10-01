package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
                int[] a =new int [10];
        int b=0,c=0;
        while (b<a.length){
            System.out.print("Introduce num: ");
            a[b] = teclat.nextInt();
            if (a[b]>=0){
                b++;
            }
            else{
                System.out.println("Vuelve a intentarlo");
            }
        }
        System.out.println(Arrays.toString(a));
    }
}