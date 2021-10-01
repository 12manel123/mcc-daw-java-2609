package com.company;

public class Pregunta {

    private String enuciat;
    private String[] respostes;
    private int correcta;

    public Pregunta(String enuciat, String[] respostes, int correcta) {
        this.enuciat = enuciat;
        this.respostes = respostes;
        this.correcta = correcta;
    }

    public String getEnuciat() {
        return enuciat;
    }

    public String[] getRespostes() {
        return respostes;
    }

    public int getCorrecta() {
        return correcta;
    }
}
