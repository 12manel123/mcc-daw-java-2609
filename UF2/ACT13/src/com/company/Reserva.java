package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva {
    Client client;
    LocalDateTime data;
    String descripcio;
    int persones;

    public Reserva(Client client, LocalDateTime data, String descripcio, int persones) {
        this.client = client;
        this.data = data;
        this.descripcio = descripcio;
        this.persones = persones;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public int getPersones() {
        return persones;
    }

    public void setPersones(int persones) {
        this.persones = persones;
    }
}
