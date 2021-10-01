package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        pelisActor[] arrayActor={
                new pelisActor(1,"W.Minerva",LocalDate.of(2002,10,20)),
                new pelisActor(2,"Norman",LocalDate.of(2001,9,15))
        };

        int[] protas1={1,3,5,2};
        int[] protas2={2,4,6};
        int[] protas3={2,7,8};

        infoPelis[] arrayPelis={
                new infoPelis("Peli1","Cesc",2015,130,protas1),
                new infoPelis("Peli2","Mariona",2016,160,protas2),
                new infoPelis("Peli3","Mirio",2016,90,protas3),
        };
        programa.buscarActor(arrayActor,arrayPelis);
        programa.buscarAutor(arrayActor,arrayPelis);
        
    }
    void buscarActor(pelisActor[] arrayActor,infoPelis[] arrayPelis) {
        Scanner teclat =new Scanner(System.in);
        int i=0,e=0,f=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de autor: ");
        String nom = teclat.nextLine();
        while(i< arrayActor.length&&trobat==false){
            if(arrayActor[i].getNom().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){
            while (e< arrayPelis.length){
                while(f< arrayPelis[e].getProtagonistes().length){
                    if (arrayPelis[e].getProtagonistes()[f]==arrayActor[p].getCodi()){
                        System.out.println(arrayPelis[e].getTítol());
                    }
                    f++;
                }
                e++;
                f=0;
            }
        }
        else{ System.out.println("No s'ha trobat"); }
    }

    void buscarAutor(pelisActor[] arrayActor,infoPelis[] arrayPelis) {
        Scanner teclat =new Scanner(System.in);
        int i=0,e=0,f=0,h=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de autor: ");
        String nom = teclat.nextLine();
        while(i< arrayPelis.length&&trobat==false){
            if(arrayPelis[i].getDirector().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){
            System.out.println("Títol: "+arrayPelis[p].getTítol());
            System.out.println("Any: "+arrayPelis[p].getAny());
            System.out.println("Durada(min): "+arrayPelis[p].getDurada());
            System.out.print("Protes: ");
            while(f<arrayPelis[p].getProtagonistes().length){
                int codiCastell = arrayPelis[p].getProtagonistes()[f];
                e = 0;
                while (e< arrayActor.length){
                    if (arrayActor[e].getCodi()==codiCastell){
                        System.out.print(arrayActor[e].getNom()+" ");
                    }
                    e++;
                }
                f++;
            }



        }
        else{ System.out.println("No s'ha trobat"); }
    }
}