package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        Scanner teclat = new Scanner(System.in);
        Llibre[] biblioteca=programa.creaBiblioteca();
        System.out.println("-----------------------");
        System.out.print("0 es fí, 1 és llsitar, 2 és buscar llibre per autor, 3 és buscar llibre per ISBN:" );
        String e=teclat.next();
        while(!e.equals("0")){
            if (e.equals("1")){
                programa.llistar(biblioteca);
            }
            if (e.equals("2")){
                programa.buscarautor(biblioteca);
            }
            if (e.equals("2")){
                programa.buscarautor(biblioteca);
            }
            if (e.equals("3")){
                programa.buscarllibre(biblioteca);
            }
            e=teclat.next();
        }

    }

    private Llibre[] creaBiblioteca() {
        return new Llibre[]{
                new Llibre(
                        "9788490353875",
                        "Programacion OO con Java usando BlueJ",
                        "Barnes, David",
                        "Pearson Educación"
                ),
                new Llibre(
                        "9788499759029",
                        "Màrius Torres. Tries de poemes, 1938",
                        "Torres, Màrius",
                        "Pagès"
                ),
                new Llibre(
                        "9788496735842",
                        "Victus",
                        "Sánchez Piñol, Albert",
                        "La Campana"
                ),
                new Llibre(
                        "9788416863310",
                        "Pell freda, La",
                        "Sánchez Piñol, Albert",
                        "La Campana"
                ),
                new Llibre(
                        "9788483836040",
                        "Lleona blanca, La",
                        "Mankell, Henning",
                        "Tusquets"
                ),
                new Llibre(
                        "9789173246545",
                        "Gossos de Riga, Els",
                        "Mankell, Henning",
                        "Tusquets"
                ),
                new Llibre(
                        "9788482646664",
                        "Altra, L'",
                        "Rojals, Marta",
                        "RBA. La Magrana"
                ),
                new Llibre(
                        "9788441539938",
                        "Java 9",
                        "Schildt, Herbert",
                        "Anaya Multimedia"
                ),
                new Llibre(
                        "9788478977611",
                        "Programación orientada a objetos con C++",
                        "Ceballos Sierra, Francisco Jav",
                        "Ra-Ma"
                ),
                new Llibre(
                        "9788441538921",
                        "Desarrollo de aplicaciones para Android",
                        "Ribas Lequerica, Joan",
                        "Anaya Multimedia"
                ),};
    }
    void llistar(Llibre[] biblioteca) {
        for(int i=0;i<biblioteca.length;i++){
            System.out.println(biblioteca[i].getIsbn()+" "+biblioteca[i].getAutor()+" "+biblioteca[i].getEditorial()+" "+biblioteca[i].getTitol());
        }
    }
    int buscarautor(Llibre[] biblioteca) {
        Scanner teclat =new Scanner(System.in);
        int i=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de autor: ");
        String nom = teclat.nextLine();
        while(i< biblioteca.length&&trobat==false){
            if(biblioteca[i].getAutor().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){ System.out.println(biblioteca[p].getTitol()); }
        else{ System.out.println("No s'ha trobat"); }
        return p;
    }
    int buscarllibre(Llibre[] biblioteca) {
        Scanner teclat =new Scanner(System.in);
        int i=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("ISBN de llibre: ");
        String nom = teclat.nextLine();
        while(i< biblioteca.length&&trobat==false){
            if(biblioteca[i].getIsbn().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){ System.out.println(biblioteca[p].getTitol()); }
        else{ System.out.println("No s'ha trobat"); }
        return p;
    }






}
