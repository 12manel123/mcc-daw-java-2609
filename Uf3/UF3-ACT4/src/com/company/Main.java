package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Main programa = new Main();
        int cMenu= 0,cont1=0;
        Scanner teclat = new Scanner(System.in);
        while (cMenu!=-1){
            System.out.println("---------------------------------------------------");
            System.out.println("1: Llistar nom asignatures, 2: Base de dades amb Asignatures Aprovades");
            System.out.println("3: Crear fitxer professors, 4: Afegir alumnes");
            System.out.print("Menu: ");
            cMenu= teclat.nextInt();
            System.out.println("---------------------------------------------------");
            if (cMenu==1){
                programa.llistarnomAssignatura();
            }
            if (cMenu==2){
                cont1=programa.asignaturaAprovada(cont1);
                cont1=programa.asignaturaAprovada(cont1);
            }
            if (cMenu==3){
                programa.profeAss();
            }
            if (cMenu==4){
                programa.crearAlumnes();
            }



        }
        //programa.crearfitxerAssignatura();
        //programa.crearFitxerAlumnesiExpedients();
        //programa.llistarAlumnes();
    }


    public void crearfitxerAssignatura() throws FileNotFoundException, IOException {
        File f0 = new File("assignatures.txt");
        PrintStream arxiuAssignatures = new PrintStream(f0);
        arxiuAssignatures.println("Bases de dades"); // codi 1
        arxiuAssignatures.println("Llenguatges de marques"); // codi 2
        arxiuAssignatures.println("Programacio"); // codi 3
        arxiuAssignatures.println("Sistemes operatius"); // codi 4
        arxiuAssignatures.close();

    }

    void crearFitxerAlumnesiExpedients() throws FileNotFoundException, IOException {

        //Alumnes
        String dni, nom, adreça, telefon;
        File f1 = new File("alumnes.dat");
        RandomAccessFile arxiuAlumnes = new RandomAccessFile(f1, "rw");

        dni = "11111111A";
        nom = "Joana Serra López";
        adreça = "Major,1";
        telefon = "1111111";
        arxiuAlumnes.writeBytes(String.format("%10s\n", dni));
        arxiuAlumnes.writeBytes(String.format("%30s\n", nom));
        arxiuAlumnes.writeBytes(String.format("%50s\n", adreça));
        arxiuAlumnes.writeBytes(String.format("%10s\n", telefon));

        dni = "22222222B";
        nom = "Marc Ponts Sans";
        adreça = "Major,2";
        telefon = "2222222";
        arxiuAlumnes.writeBytes(String.format("%10s\n", dni));
        arxiuAlumnes.writeBytes(String.format("%30s\n", nom));
        arxiuAlumnes.writeBytes(String.format("%50s\n", adreça));
        arxiuAlumnes.writeBytes(String.format("%10s\n", telefon));

        dni = "33333333C";
        nom = "Diana Marcos Figuerola";
        adreça = "Major,3";
        telefon = "3333333";
        arxiuAlumnes.writeBytes(String.format("%10s\n", dni));
        arxiuAlumnes.writeBytes(String.format("%30s\n", nom));
        arxiuAlumnes.writeBytes(String.format("%50s\n", adreça));
        arxiuAlumnes.writeBytes(String.format("%10s\n", telefon));

        // Expedients
        File f2 = new File("expedients.dat");
        RandomAccessFile arxiuExpedients = new RandomAccessFile(f2, "rw");
        int codiAssignatura, notaOrdinaria, notaExtraordinaria;



        dni = "11111111A";
        codiAssignatura = 1;
        notaOrdinaria = 6;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);

        dni = "11111111A";
        codiAssignatura = 2;
        notaOrdinaria = 4;
        notaExtraordinaria = 8;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);
        dni = "11111111A";
        codiAssignatura = 3;
        notaOrdinaria = 9;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);

        dni = "22222222B";
        codiAssignatura = 1;
        notaOrdinaria = 5;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);
        dni = "22222222B";
        codiAssignatura = 2;
        notaOrdinaria = 7;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);
        dni = "22222222B";
        codiAssignatura = 4;
        notaOrdinaria = 8;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);

        dni = "33333333C";
        codiAssignatura = 1;
        notaOrdinaria = 8;
        notaExtraordinaria = -1;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);
        dni = "33333333C";
        codiAssignatura = 4;
        notaOrdinaria = 4;
        notaExtraordinaria = 6;
        arxiuExpedients.writeBytes(String.format("%10s\n", dni));
        arxiuExpedients.writeInt(codiAssignatura);
        arxiuExpedients.writeInt(notaOrdinaria);
        arxiuExpedients.writeInt(notaExtraordinaria);

    }




    void llistarnomAssignatura() throws FileNotFoundException, IOException {
        File f = new File("assignatures.txt");
        RandomAccessFile arxiu = new RandomAccessFile(f,"r");
        int cont1=0;
        String[] assig = new String[4];
                while (arxiu.getFilePointer()<arxiu.length()) {
                    String nom = arxiu.readLine();
                    assig[cont1]=nom;
                    cont1++;
                }
            System.out.println(Arrays.toString(assig));
    }

    int asignaturaAprovada(int codiAss) throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("assignatures.txt");
        Scanner arxiuAssignatura = new Scanner(f);
        File g = new File("expedients.dat");
        RandomAccessFile arxiuExpedient = new RandomAccessFile(g,"r");
        File h = new File("alumnes.dat");
        RandomAccessFile arxiuAlumnes = new RandomAccessFile(h,"r");

        int codiAss2=codiAss;
        int cont1=0;
        int codiAssteclat= teclat.nextInt();

        while (arxiuAssignatura.hasNext()) {
            cont1++;
            String nomAss = arxiuAssignatura.nextLine();
            if(cont1 == codiAssteclat) {
                File i = new File (nomAss+".txt");
                PrintStream arxiuBD = new PrintStream(i);
                while (arxiuExpedient.getFilePointer() < arxiuExpedient.length()) {
                    String dniEx = arxiuExpedient.readLine().trim();
                    int cAss = arxiuExpedient.readInt();
                    int nOrd = arxiuExpedient.readInt();
                    arxiuExpedient.readInt();
                    if (cont1 == cAss&& cAss!=codiAss2) {
                        codiAss=cAss;
                        while (arxiuAlumnes.getFilePointer() < arxiuAlumnes.length()) {
                            String dni = "", nom = "", adreça = "", telefon = "";
                            dni = arxiuAlumnes.readLine().trim();
                            nom = arxiuAlumnes.readLine().trim();
                            adreça = arxiuAlumnes.readLine().trim();
                            telefon = arxiuAlumnes.readLine().trim();

                            if (dni.equals(dniEx)&&nOrd>=5) {
                                arxiuBD.println("DNI: " + dniEx + " Nom: " + nom + ": " + adreça + " Telefon: " + telefon + " Nota: " + nOrd);
                            }
                        }
                        arxiuAlumnes.seek(0);
                    }
                }
                arxiuExpedient.seek(0);
            }
        }
        return codiAss;
    }

    void profeAss() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("assignatures.txt");
        RandomAccessFile arxiuAss = new RandomAccessFile(f,"r");
        File g = new File("professors.dat");
        RandomAccessFile arxiuProf = new RandomAccessFile(g,"rw");

        arxiuProf.seek(arxiuProf.length());
        System.out.println("Entra nom professor: ");
        String nomP= teclat.next().trim();
        System.out.println("Entra codi de l'assignatura: ");
        int codiAss= teclat.nextInt();
        System.out.println("Edat: ");
        int edat= teclat.nextInt();

        arxiuProf.writeBytes(String.format("%30s\n", nomP));
        arxiuProf.writeDouble(codiAss);
        arxiuProf.writeDouble(edat);

        arxiuProf.seek(0);
        int cont1=0;
        while (arxiuAss.getFilePointer()<arxiuAss.length()) {
            String nomAss = arxiuAss.readLine();
            cont1++;
            if (cont1==codiAss){
                System.out.println("Creat el professor: "+nomP+". En l'Assignatura "+nomAss+" amb l'edat de: "+edat);
            }
        }
    }

    void crearAlumnes() throws FileNotFoundException, IOException {
        Scanner teclat = new Scanner(System.in);
        File f = new File("alumnes.dat");
        RandomAccessFile arxiu = new RandomAccessFile(f,"rw");
        arxiu.seek(arxiu.length());

        System.out.print("Entra dni alumne: ");
        String dniP= teclat.next().trim();
        System.out.print("Entra nom: ");
        String nomP= teclat.next().trim();
        System.out.print("Entra adreça: ");
        String adreP= teclat.next().trim();
        System.out.println("Entra telefon: ");
        String telefP= teclat.next().trim();

        arxiu.writeBytes(String.format("%10s\n", dniP));
        arxiu.writeBytes(String.format("%30s\n", nomP));
        arxiu.writeBytes(String.format("%50s\n", adreP));
        arxiu.writeBytes(String.format("%10s\n", telefP));
        System.out.println("Creat el alumne"+nomP+" amb el DNI: "+dniP+", adeça: "+adreP+"i el telefon: "+telefP);

    }
}







