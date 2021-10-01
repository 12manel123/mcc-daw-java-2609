package com.company;

public class Persona {
    String nom;
    String cognom;
    String telefon;

    public Persona(String nom, String cognom, String telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.telefon = telefon;
    }

    public Persona() {
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getTelefon() {
        return telefon;
    }
}
