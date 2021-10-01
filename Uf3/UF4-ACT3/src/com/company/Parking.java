package com.company;
import java.time.format.DateTimeFormatter;
import java.time.*;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Parking {
    Plaça[] places;

    public Parking(int maxPlaces) {
        places = new Plaça[maxPlaces];
        for(int i=0;i<places.length;i++) {
            places[i] = new Plaça(i,"primera planta");
    }
    }

    public boolean aparcar(String matricula){


        for (int i=0;i<places.length;i++){
            if (places[i].ocupada==false){
                places[i].ocupada=true;
                places[i].matricula=matricula;
                places[i].horaEntrada=LocalDateTime.now();
                return true;
            }
        }

        return false;
    }

    public double desaparcar(String matricula){

double din=0.0;
        for (int i=0;i<places.length;i++){

            if (places[i].matricula.equals(matricula)){
                places[i].ocupada=false;
                places[i].matricula="";
                din=SECONDS.between(places[i].horaEntrada, LocalDateTime.now());
                places[i].horaEntrada= null;
                return (din*3);

            }
        }

        return 0;
    }

    void llistat(){
        for (int i=0;i<places.length;i++){
            System.out.println("Numero: "+places[i].numero+" Ocupada: "+places[i].ocupada);

            if (places[i].ocupada){
                DateTimeFormatter dies= DateTimeFormatter.ofPattern("dd-MM-yyyy");
                DateTimeFormatter hora= DateTimeFormatter.ofPattern("HH:mm:ss");
                System.out.println("Dia: "+places[i].getHoraEntrada().format(dies));
                System.out.println("Dia: "+places[i].getHoraEntrada().format(hora));
            }
            System.out.println("");



        }
    }

    public boolean isPle(){
        int f=0;
        for (int i=0;i<places.length;i++){
            if (places[i].ocupada==true){
                f++;
                if (f==places.length){
                    System.out.println("Ocupades totes les plaçes");
                    return true;
                }
            }
        }
        return false;
    }

    public int numPlacesLliures(){
        int f=0;
        for (int i=0;i<places.length;i++){
            if (places[i].ocupada==false){
                f++;
            }
        }
        return f;
    }

}