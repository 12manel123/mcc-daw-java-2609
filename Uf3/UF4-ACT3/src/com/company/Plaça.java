package com.company;

import java.time.LocalDateTime;

public class Plaça {
    int numero;
    String ubicacio;
    boolean ocupada;
    String matricula;
    LocalDateTime horaEntrada;

    public Plaça(int numero, String ubicacio, boolean ocupada, String matricula, LocalDateTime horaEntrada) {
        this.numero = numero;
        this.ubicacio = ubicacio;
        this.ocupada = ocupada;
        this.matricula = matricula;
        this.horaEntrada = horaEntrada;
    }

    public Plaça(int numero, String ubicacio) {
        this.numero = numero;
        this.ubicacio = ubicacio;
        this.ocupada=false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacio() {
        return ubicacio;
    }

    public void setUbicacio(String ubicacio) {
        this.ubicacio = ubicacio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
