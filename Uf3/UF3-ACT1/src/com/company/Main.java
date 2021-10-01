package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {

        File f = new File("prova2.txt");
        Main programa = new Main();
        if (f.exists()) {
            double suma=0;
            double contador=0;
            Scanner arxiuLectura = new Scanner(f);
            while (arxiuLectura.hasNext()) {

                String nom = arxiuLectura.next();
                System.out.print(nom+" ");
                String cognom = arxiuLectura.next();
                System.out.print(cognom+" - Mitjana: ");
                while (arxiuLectura.hasNextDouble()) {
                    double numero = arxiuLectura.nextDouble();
                    suma=suma+numero;
                    contador++;
                }
                double res=suma/contador;
                System.out.println(programa.formatar(res));
            }
        }
        else {
            System.out.println("Error: Fitxer no existeix");
        }
    }

    public double formatar(double n) throws ParseException {
        DecimalFormat formatar = new DecimalFormat("####.##");
        double num = formatar.parse(formatar.format(n)).doubleValue();
        return num;
    }
}
