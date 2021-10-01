package com.company;

import java.util.List;

public class Assignatura {
    private int codi;
    private String nom;

    public Assignatura() {
    }

    public Assignatura(int codi, String nom) {
        this.codi = codi;
        this.nom = nom;
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

    public List<Expedient> getNotes() {
        ExpedientDAO expedientDAO = new ExpedientDAO();
        return expedientDAO.getNotesAssignatura(this.codi);

    }
}