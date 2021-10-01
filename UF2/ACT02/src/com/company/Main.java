package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] v = new int[10];
        main.incicialitzaAleatori(v, 1, 50);
        for (int i = 0; i < v.length; i++) { System.out.println(v[i]); }
        int[] w = new int[5];
        main.incicialitzaAleatori(w, 1, 50);
        main.imprimir(v);
        System.out.println(main.suma(v));
        System.out.println(main.mitjana(v));
        System.out.println(main.max(v));
        System.out.println(main.min(v));
        System.out.println(main.rang(v));
        int []resulta=main.valorsSuperiors(v,20);
        main.imprimir(resulta);
        int []result=main.valorsInferiors(v,30);
        main.imprimir(result);
        int []resultat=main.multiplica(v,2);
        main.imprimir(resultat);
        System.out.println("-----------------------------");

        int []resultaS=main.suma(w,v);
        main.imprimir(resultaS);

    }

    void incicialitzaAleatori(int[] array, int desDe, int finsA) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(finsA) + desDe;
        }
    }

    void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    int suma(int[] llista) {
        int a = 0;
        for (int i = 0; i < llista.length; i++) {
            a = llista[i] + a;
        }
        return a;
    }
    double mitjana(int[] llista) {
        double a = 0;
        for (int i = 0; i < llista.length; i++) {
            a = llista[i] + a;
        }
        a=a/ llista.length;
        return a;
    }
    int max(int[] llista) {
        int c=llista[0];
        for (int i = 0; i < llista.length; i++) {
            if (llista[i]>c){
                c=llista[i];
            }
        }
        return c;
    }
    int min(int[] llista) {
        int c=llista[0];
        for (int i = 0; i < llista.length; i++) {
            if (llista[i]<c){
                c=llista[i];
            }
        }
        return c;
    }
    int rang(int[] llista) {
        int max=llista[0];
        for (int i = 0; i < llista.length; i++) {
            if (llista[i]<max){
                max=llista[i];
            }
        }
        int min=llista[0];
        for (int i = 0; i < llista.length; i++) {
            if (llista[i]>min){
                min=llista[i];
            }
        }
        int rango = min-max;
        return rango;
    }
    int[] valorsSuperiors(int[] llista, double valor) {
        int []valS=new int[llista.length];
        int f=0;
        for(int i=0;i<llista.length;i++){
            if(llista[i]>valor){
                valS[f]=llista[i];
                f++;
            }
        }
        return valS;
    }
    int[] valorsInferiors(int[] llista, double valor) {
        int []valS=new int[llista.length];
        int f=0;
        for(int i=0;i<llista.length;i++){
            if(llista[i]<valor){
                valS[f]=llista[i];
                f++;
            }
        }
        return valS;
    }
    int[] multiplica(int[] array, int n) {
        int []multi=new int[array.length];
        for(int i=0;i<array.length;i++){ multi[i]=array[i]*n; }
        return multi;
    }
    int[] suma(int[] array1, int[] array2) {
        if (array1.length<array2.length){
            int []sumar=new int[array1.length];
            for(int i=0;i<array1.length;i++){ sumar[i]=array1[i]+array2[i]; }
            return sumar;
        }
        else{
            int []sumar=new int[array2.length];
            for(int i=0;i<array2.length;i++){ sumar[i]=array1[i]+array2[i]; }
            return sumar;
        }
    }
}
