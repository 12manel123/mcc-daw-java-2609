package com.company;

public class Colla {
    String nom;
    String Localitat;
    int[] codisCastellsPrincipals;


    public Colla(String nom, String localitat, int[] codisCastellsPrincipals) {
        this.nom = nom;
        Localitat = localitat;
        this.codisCastellsPrincipals = codisCastellsPrincipals;
    }

    public String getNom() {
        return nom;
    }

    public String getLocalitat() {
        return Localitat;
    }

    public int[] getCodisCastellsPrincipals() {
        return codisCastellsPrincipals;
    }
}
