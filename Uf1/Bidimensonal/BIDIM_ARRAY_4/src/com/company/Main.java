package com.company;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[4][6];
        int g=0,d=0,e=100;
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random.nextInt(100);
                g=g+array[i][j];
                if(array[i][j]>d){
                    d=array[i][j];
                }
                if(array[i][j]<e){
                    e=array[i][j];
                }
            }
            System.out.println("Suma de fila "+i+": "+g);
            g=0;
        }
        for(int i = 0; i < 4; i++) {
            System.out.print("Fila " + i + " { ");
            for (int j = 0; j < 6; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("}");
        }
        System.out.println("Num mes gran: "+d);
        System.out.println("Num mes petit: "+e);
    }
}
