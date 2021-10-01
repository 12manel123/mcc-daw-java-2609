package com.company;

import java.time.LocalDate;

public class pelisActor {
    int codi;
    String nom;
    LocalDate data_naixement;

    public pelisActor(int codi, String nom, LocalDate data_naixement) {
        this.codi = codi;
        this.nom = nom;
        this.data_naixement = data_naixement;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getData_naixement() {
        return data_naixement;
    }

    public void setData_naixement(LocalDate data_naixement) {
        this.data_naixement = data_naixement;
    }
}
