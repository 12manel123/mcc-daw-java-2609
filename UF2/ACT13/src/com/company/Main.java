package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        Client[] arrayClient={
                new Client("Pepe", 698234566),
                new Client("Juan", 698234567),
                new Client("Manolo", 698234568)


        };


        Reserva[] arrayReserva= new Reserva[30];

        arrayReserva[0]=new Reserva(arrayClient[0], LocalDateTime.of(2004, 3,20,11,20),"Potser amb retras",12);
        arrayReserva[1]=new Reserva(arrayClient[1], LocalDateTime.of(2005, 2,21,11,20),"Potser amb retraso",5);
        arrayReserva[2]=new Reserva(arrayClient[1], LocalDateTime.of(2006, 12,22,11,20),"Puntual",2);
        int cont=3;

        System.out.println(arrayReserva[0].getData());

        Scanner teclat =new Scanner(System.in);

        String e="0";
        while(!e.equals("6")){

            if (e.equals("1")){
                programa.reservaDia(arrayReserva,cont); //ta bien
            }
            if (e.equals("2")){
                programa.nomReserva(arrayClient,arrayReserva,cont); //ta bien
            }
            if (e.equals("3")){
                cont = programa.crearReserva(arrayClient,arrayReserva,cont);//ta bien
            }
            if (e.equals("4")){
                cont = programa.cancelarReserva(arrayClient,arrayReserva,cont);//ta bien
            }
            if (e.equals("5")){
                programa.ocupacioDia(arrayReserva,cont);//ta bien
            }
            System.out.println("-----------------------");
            System.out.println("0 es fí, 1 és buscar per data, 2 és buscar reserva per client, 3 és crear reserva, 4 és cancelar reserva, 5 és calcular % ocupat per dia:" );
            System.out.println("-----------------------");
            System.out.print("Menú: ");
            e=teclat.next();

        }
    }



    void reservaDia(Reserva[] arrayReserva,int cont) {
        Scanner teclat =new Scanner(System.in);
        int i=0,e=0;
        System.out.print("Dia: ");
        String strDataHora = teclat.nextLine();
        LocalDateTime dia = LocalDateTime.parse(
                strDataHora,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );

        while(i< cont){
            if(arrayReserva[i].getData().equals(dia)){
                System.out.println("--Reserva "+i+"--");
                System.out.println("Client: "+arrayReserva[i].getClient().getNom());
                System.out.println("Data: "+arrayReserva[i].getData());
                System.out.println("Descripció: "+arrayReserva[i].getDescripcio());
                System.out.println("Persones: "+arrayReserva[i].getPersones());
                System.out.println("");
            }
            i++;
        }
    }





    void nomReserva(Client[] arrayClient,Reserva[] arrayReserva,int cont) {
        Scanner teclat =new Scanner(System.in);
        int i=0;
        System.out.print("Nom client: ");
        String nom = teclat.nextLine();
        while(i< cont){
            if(arrayReserva[i].getClient().getNom().equals(nom)){
                        System.out.println("--Reserva "+i+"--");
                        System.out.println("Client: "+arrayReserva[i].getClient().getNom());
                        System.out.println("Data: "+arrayReserva[i].getData());
                        System.out.println("Descripció: "+arrayReserva[i].getDescripcio());
                        System.out.println("Persones: "+arrayReserva[i].getPersones());
                        System.out.println("");
            }
            i++;
        }
    }






    int crearReserva(Client[] arrayClient, Reserva[] arrayReserva, int cont) {
        Scanner teclat =new Scanner(System.in);
        int i=0,f=0;
        while(i< cont){
            f=f+arrayReserva[i].getPersones();
            i++;
        }
        if (f<=100){

            System.out.println("Tiempo:");
            String strDataHora = teclat.nextLine();
            System.out.println("Desc:");
            String dec=teclat.nextLine();
            System.out.println("Client:");
            String nom= teclat.nextLine();
            System.out.println("Telefono:");
            int telefono = teclat.nextInt();
            System.out.println("Personas:");
            int per= teclat.nextInt();
            LocalDateTime dia = LocalDateTime.parse(strDataHora, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
            arrayReserva[cont]=new Reserva(new Client(nom, telefono),dia,dec,per);
            cont++;
        }
        return cont;
    }




    int cancelarReserva(Client[] arrayClient, Reserva[] arrayReserva, int cont) {
        Scanner teclat =new Scanner(System.in);
        System.out.print("Nom client: ");
        String nom = teclat.nextLine();
        System.out.print("Dia: ");
        String strDataHora = teclat.nextLine();
        LocalDateTime dia = LocalDateTime.parse(
                strDataHora,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        int f=0,e;
        while (f<cont){
            if (arrayReserva[f].getClient().getNom().equals(nom)&& arrayReserva[f].getData().equals(dia)){
                arrayReserva[f]=null;
                e=f;
                while (e<cont-1){
                    arrayReserva[e]= arrayReserva[(e+1)];
                    e++;
                }
            }
            f++;
        }
        return cont-1;

    }






    void ocupacioDia(Reserva[] arrayReserva,int cont) {
        Scanner teclat =new Scanner(System.in);
        int i=0,f=0;
        System.out.print("Dia: ");
        String strDataHora = teclat.nextLine();
        LocalDateTime dia = LocalDateTime.parse(
                strDataHora,
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        while(i< cont){
            if (arrayReserva[i].getData().equals(dia)){
                f=f+arrayReserva[i].getPersones();
            }
            i++;
        }
        System.out.println(f+"% del 100%");
    }



}
