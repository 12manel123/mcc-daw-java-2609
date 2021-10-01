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
        System.out.println("Ha sortit "+c+" cops el 1");
        System.out.println("Ha sortit "+d+" cops el 2");
        System.out.println("Ha sortit "+e+" cops el 3");
        System.out.println("Ha sortit "+f+" cops el 4");
        System.out.println("Ha sortit "+g+" cops el 5");
        System.out.println("Ha sortit "+h+" cops el 6");
    }
}