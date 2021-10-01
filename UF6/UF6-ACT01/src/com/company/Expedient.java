package com.company;

public class Expedient {
    private int codiAssignatura;
    private String dni;
    private double nota_ordinaria;
    private double nota_extraordinaria;

    public double getNota_ordinaria() {
        return nota_ordinaria;
    }

    public double getNota_extraordinaria() {
        return nota_extraordinaria;
    }

    public int getCodiAssignatura() {
        return codiAssignatura;
    }

    public void setCodiAssignatura(int codiAssignatura) {
        this.codiAssignatura = codiAssignatura;
    }

    public void setNota_ordinaria(double nota_ordinaria) {
        this.nota_ordinaria = nota_ordinaria;
    }

    public void setNota_extraordinaria(double nota_extraordinaria) {
        this.nota_extraordinaria = nota_extraordinaria;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}