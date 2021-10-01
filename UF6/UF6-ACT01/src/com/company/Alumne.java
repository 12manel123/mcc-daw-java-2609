package com.company;

import java.util.List;

// Classe Alumne:
// 2 constructors : sense paràmetres, amb tots els paràmetres segons atributs

// Setters i getters implementats

public class Alumne {
    private String dni;
    private String nom;
    private String adreça;
    private String telefon;

    public Alumne() {
    }

    public Alumne(String dni, String nom, String adreça, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreça = adreça;
        this.telefon = telefon;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    /**
     * getNotes: retorna llista amb l'expedient o les notes de les assignatures a les
     * que l'alumne s'ha matriculat
     * @return arrayList d'objectes Expedient
     */
    public List<Expedient> getNotes() {
        ExpedientDAO expedientDAO = new ExpedientDAO();
        return expedientDAO.getNotesAlumne(this.dni);

    }
   }
