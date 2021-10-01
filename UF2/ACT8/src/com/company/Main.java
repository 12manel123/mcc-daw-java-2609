package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main programa = new Main();
        // Creem un vector de persones per a emmagatzemar les dades de l'agenda
        Persona[] agenda = new Persona[10];
        int nPersones = 0; // Indiquem que inicialment no hi ha cap persona

        char opcio = programa.menu();
        while ( opcio != 'f') {
            switch (opcio) {
                case 'n':
                    nPersones = programa.crearPersona(agenda,nPersones);
                    break;
                case 'l':
                    programa.llistaAgenda(agenda,nPersones);
                    break;
                case 'c':
                    programa.cercaPersona(agenda,nPersones);
                    break;
                case 'e':
                    nPersones = programa.eliminaPersona(agenda,nPersones);
                    break;
                case 'f':
                    System.out.println("Fins aviat");
                    break;
                default:
                    System.out.println("Opció incorrecta");
            }

            opcio = programa.menu();
        }

    }

    /**
     * Mostra per pantalla les diferents opcions que l'usuari pot escollir
     * @return Opció escollida per l'usuari
     */
    char menu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("");
        System.out.println("Agenda");
        System.out.println("---------------");
        System.out.println("[n] Nou contacte.");
        System.out.println("[l] Llistar agenda.");
        System.out.println("[c] Cercar contacte.");
        System.out.println("[e] Eliminar contacte.");
        System.out.println("[f] Sortir.");
        System.out.print("Què vols fer?: ");

        return entrada.next().charAt(0);

    }


    /**
     * Afegeix un nou objecte Persona dins l'agenda
     * @param agenda
     * @param nPersones Número de persones que hi ha dins l'agenda
     * @return El número de persones incrementat en 1
     */
    int crearPersona(Persona[] agenda, int nPersones) {
        Scanner teclat =new Scanner(System.in);
        System.out.print("Entra nom: ");
        String nom= teclat.next();
        System.out.print("Entra cognom: ");
        String cognom= teclat.next();
        System.out.print("Entra telefon: ");
        String telefon= teclat.next();
        Persona p = new Persona(nom,cognom,telefon);
        agenda[nPersones]=p;
        nPersones++;
        return nPersones;
    }

    /**
     * Busca una persona en l'agenda i mostra les seves dades
     * Si no hi és mostra el missatge que la persona no existeix
     * @param agenda
     * @param nPersones Número de persones que hi ha dins l'agenda
     *
     */
    int cercaPersona(Persona[] agenda, int nPersones) {
        Scanner teclat =new Scanner(System.in);
        //cercar nom i mostrar telef
        int i=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de la persona a buscar: ");
        String nom = teclat.next();
        while(i<nPersones&&trobat==false){
            if(agenda[i].getNom().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){ System.out.println(agenda[p].getNom()+" "+agenda[p].getTelefon()); }
        else{ System.out.println("No s'ha trobat"); }
        return p;
    }

    /**
     * Esborra un contacte de l'agenda
     * Per fer-ho ha de desplaçar totes les persones una posició endarrera a partir
     * de la posició esborrada
     * @param agenda
     * @param nPersones Número de persones que hi ha dins l'agenda
     * @return número de persones decrementat en 1
     */
    int eliminaPersona(Persona[] agenda, int nPersones) {

        int pos=cercaPersona(agenda,nPersones);
        if (pos != -1) {
            for(int i=pos;i<nPersones;i++){
                    agenda[i]=agenda[i+1];
                    agenda[i]=null;
            }

            nPersones--;
        }
        else{ System.out.println("Nos'ha trobat :"); }

        return nPersones;
    }

    /**
     * Mostra el contingut de l'agenda
     * @param agenda
     * @param nPersones Número de persones que hi ha dins l'agenda
     */
    void llistaAgenda(Persona[] agenda, int nPersones) {
        for(int i=0;i<nPersones;i++){
            System.out.println(agenda[i].getNom()+" "+agenda[i].cognom+" "+agenda[i].telefon);
        }
    }
}
