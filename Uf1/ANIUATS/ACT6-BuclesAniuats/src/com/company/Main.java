package com.company;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a =new int [100];
        int b=0,c=0,d=0,e=0,f=0,g=0,h=0;
        while (b<a.length){
            a[b]= random.nextInt(6)+1;
            if (a[b]==1){ c++; }
            else{
                if (a[b]==2){ d++; }
                else{
                    if (a[b]==3){ e++; }
                    else{
                        if (a[b]==4){ f++; }
                        else{
                            if (a[b]==5){ g++; }
                            else{ h++; }
                        }
                    }
                }
            }
            b++;
        }
        int[] j = {c,d,e,f,g,h};
        int i=0,k,l=1;
        while (i<=5){
            System.out.print(l+" ");
            k=0;
            while(k<=j[i]){
                System.out.print("▄ ");
                k++;
            }
            System.out.println("");
            l++;
            i++;
        }
    }
}