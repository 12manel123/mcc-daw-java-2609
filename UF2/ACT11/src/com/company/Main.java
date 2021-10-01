package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        Castell[] arrayCastell={new Castell(1,"Quatre de set",800,980),
                new Castell(27,"Tres de deu amb folre i manilles",12500,13200),
                new Castell(3,"Quatre de set amb l'agulla",1220,1440),
                new Castell(22,"Quatre de nou amb folre i l'agulla",9200,9800),
                new Castell(2,"Tres de set",1000,1200),
                new Castell(21,"Cinc de nou amb folre",8600,9180),
                new Castell(20,"Pilar de vuit amb folre i manilles",8020,8580)};

        int[] codis={21,3,20};
        int[] codis2={2,1,3};
        int[] codis3={22,20,21};
        int[] codis4={27,22,20};

        Colla[] arrayColla={new Colla("Colla Vella dels Xiquets de Valls","Valls",codis),
                new Colla("Xiquets del Serrallo","Tarragona",codis2),
                new Colla("Minyons de Terrassa","Terrassa",codis3),
                new Colla("Xiquets de Vilafranca","Vilafranca",codis4)};
        programa.buscarColla(arrayCastell, arrayColla);
        programa.buscarCastell(arrayCastell, arrayColla);
    }

    void buscarColla(Castell[] arrayCastell,Colla[] arrayColla) {
        Scanner teclat =new Scanner(System.in);
        int i=0,e=0,f=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de colla: ");
        String nom = teclat.nextLine();
        while(i< arrayColla.length){
            if(arrayColla[i].getNom().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){
                while(f<arrayColla[p].getCodisCastellsPrincipals().length){
                    int codiCastell = arrayColla[p].getCodisCastellsPrincipals()[f];
                    e = 0;
                    while (e< arrayCastell.length){
                        if (arrayCastell[e].getCodi()==codiCastell){
                          System.out.println(arrayCastell[e].getDescripció());
                        }
                      e++;
                   }
                    f++;
                }
                /*
                for (f=0;f<arrayColla[p].getCodisCastellsPrincipals().length;f++){
                    int codiCastell = arrayColla[p].getCodisCastellsPrincipals()[f];
                    e = 0;
                    while (e< arrayCastell.length){
                        if (arrayCastell[e].getCodi()==codiCastell){
                            System.out.println(arrayCastell[e].getDescripció());
                        }
                        e++;
                    }
                }

                 */
            }
        else{ System.out.println("No s'ha trobat"); }
    }


    void buscarCastell(Castell[] arrayCastell,Colla[] arrayColla) {
        Scanner teclat =new Scanner(System.in);
        int i=0,e=0,f=0;
        boolean trobat=false;
        int p=-1;
        System.out.println("Nom de castell: ");
        String nom = teclat.nextLine();
        while(i< arrayCastell.length&&trobat==false){
            if(arrayCastell[i].getDescripció().equals(nom)){
                p=i;
                trobat=true;
            }
            i++;
        }
        if (trobat==true){
                while (e< arrayColla.length){
                    while(f< arrayColla[e].getCodisCastellsPrincipals().length){
                        if (arrayColla[e].getCodisCastellsPrincipals()[f]==arrayCastell[p].getCodi()){
                            System.out.println(arrayColla[e].getNom());
                        }
                        f++;
                    }
                    e++;
                    f=0;
                }
        }
        else{ System.out.println("No s'ha trobat"); }
    }

}
