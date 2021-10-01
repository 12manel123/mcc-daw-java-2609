package com.company;

public class infoPelis {
    String títol;
    String director;
    int any;
    int durada; //en minuts
    int[] protagonistes; //codis dels seus protagonistes.

    public infoPelis(String títol, String director, int any, int durada, int[] protagonistes) {
        this.títol = títol;
        this.director = director;
        this.any = any;
        this.durada = durada;
        this.protagonistes = protagonistes;
    }

    public String getTítol() {
        return títol;
    }

    public void setTítol(String títol) {
        this.títol = títol;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public int getDurada() {
        return durada;
    }

    public void setDurada(int durada) {
        this.durada = durada;
    }

    public int[] getProtagonistes() {
        return protagonistes;
    }

    public void setProtagonistes(int[] protagonistes) {
        this.protagonistes = protagonistes;
    }
}
