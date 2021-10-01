package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Main programa = new Main();
        Scanner teclat = new Scanner(System.in);
        int cMenu= 0;
        while (cMenu!=-1){
            System.out.println("---------------------------------------------------");
            System.out.println("1: Afegeixes joc, 2: Sumar partides, 3: Cambiar record");
            System.out.println("4: Llistar jocs, 5: Cercar pero codi, 6: Cercar per nom del joc");
            System.out.print("Menu: ");
            cMenu= teclat.nextInt();
            System.out.println("---------------------------------------------------");
            if (cMenu==1){
                programa.afegirJoc();
            }
            if (cMenu==2){
                programa.sumarPartides();
            }
            if (cMenu==3){
                programa.cambiarRecord();
            }
            if (cMenu==4){
                programa.llistarJoc();
            }
            if (cMenu==5){
                programa.cercaCodi();
            }
            if (cMenu==6){
                programa.cercarJoc();
            }


        }
    }

    public void crearfitxer() throws FileNotFoundException, IOException {
        File f = new File("Jocs.dat");
        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "rw");
        String[]nomProductes={"Genshin","Minecraft","COD"};
        double[]preu={0,25.5,10};
        double[]npartides={20,10,5};
        double[]record={100,50,20};
        for (int i = 0; i < 3; i++) {
            arxiuProductes.writeBytes(String.format("%20s\n", nomProductes[i]));
            arxiuProductes.writeDouble(preu[i]);
            arxiuProductes.writeDouble(npartides[i]);
            arxiuProductes.writeDouble(record[i]);
        }
        System.out.println("Fitxer escrit satisfactòriament.");
    }

    public void afegirJoc() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("Jocs.dat");
        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "rw");

        arxiuProductes.seek(arxiuProductes.length());
        System.out.println("Entra nom: ");
        String nom= teclat.next();
        System.out.println("Entra preu: ");
        double preu= teclat.nextDouble();
        System.out.println("Entra numero de partides: ");
        double npartides= teclat.nextDouble();
        System.out.println("Entra record: ");
        double record= teclat.nextDouble();
        arxiuProductes.writeBytes(String.format("%20s\n", nom));
        arxiuProductes.writeDouble(preu);
        arxiuProductes.writeDouble(npartides);
        arxiuProductes.writeDouble(record);


        arxiuProductes.close();
    }

    public void sumarPartides() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        boolean trobat=false;
        File f = new File("Jocs.dat");
        System.out.println("Entra nom:");
        String nomCercat=teclat.next();

        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "rw");
        while (arxiuProductes.getFilePointer() < arxiuProductes.length() && trobat==false) {
            String nom = arxiuProductes.readLine();
            double preu= arxiuProductes.readDouble();
            double npartides= arxiuProductes.readDouble();
            double record= arxiuProductes.readDouble();
            if (nom.trim().equals(nomCercat)){
                trobat=true;
                System.out.println("Partides més jugades: ");
                double npartidesmas= teclat.nextDouble();
                arxiuProductes.seek(arxiuProductes.getFilePointer()-16); //seek permet anar a una posició més enrere
                arxiuProductes.writeDouble(npartides+npartidesmas);

            }

        }
        if(trobat=false){
            System.out.println("No s'ha trobat");
        }
        arxiuProductes.close();
    }

    public void cambiarRecord() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        boolean trobat=false;
        File f = new File("Jocs.dat");
        System.out.println("Entra nom:");
        String nomCercat=teclat.next();

        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "rw");
        while (arxiuProductes.getFilePointer() < arxiuProductes.length() && trobat==false) {
            String nom = arxiuProductes.readLine();
            double preu= arxiuProductes.readDouble();
            double npartides= arxiuProductes.readDouble();
            double record= arxiuProductes.readDouble();
            if (nom.trim().equals(nomCercat)){
                trobat=true;
                System.out.println("Nou record: ");
                double nourecord= teclat.nextDouble();
                arxiuProductes.seek(arxiuProductes.getFilePointer()-8);
                arxiuProductes.writeDouble(nourecord);
            }
        }
        if(trobat=false){
            System.out.println("No s'ha trobat");
        }
        arxiuProductes.close();
    }






    public void llistarJoc() throws FileNotFoundException, IOException {
        File f = new File("Jocs.dat");
        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "r");
        while (arxiuProductes.getFilePointer() < arxiuProductes.length()) {
            String nom = arxiuProductes.readLine();
            double preu= arxiuProductes.readDouble();
            double npartides= arxiuProductes.readDouble();
            double record= arxiuProductes.readDouble();
            System.out.println("Nom: " + nom.trim()+" Preu: "+preu + " Num Partides: "+npartides+" Record: "+record);
        }
        arxiuProductes.close();
    }

    public void cercaCodi() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("Jocs.dat");
        System.out.println("Entra codi:");
        int codiCercat=teclat.nextInt();
        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "r");
        arxiuProductes.seek((codiCercat-1)* 45);
        String nom = arxiuProductes.readLine();
        double preu= arxiuProductes.readDouble();
        double npartides= arxiuProductes.readDouble();
        double record= arxiuProductes.readDouble();
        System.out.println("Nom: " + nom.trim()+" Preu: "+preu + " Num Partides: "+npartides+" Record: "+record);
        arxiuProductes.close();
    }

    public void cercarJoc() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("Jocs.dat");
        System.out.println("Entra nom:");
        String nomCercat=teclat.next();
        RandomAccessFile arxiuProductes = new RandomAccessFile(f, "r");
        while (arxiuProductes.getFilePointer() < arxiuProductes.length()) {
            String nom = arxiuProductes.readLine();
            double preu= arxiuProductes.readDouble();
            double npartides= arxiuProductes.readDouble();
            double record= arxiuProductes.readDouble();
            if (nom.trim().equals(nomCercat)){
                System.out.println("Nom: " + nom.trim()+" Preu: "+preu + " Num Partides: "+npartides+" Record: "+record);
            }
        }
        arxiuProductes.close();
    }






}
