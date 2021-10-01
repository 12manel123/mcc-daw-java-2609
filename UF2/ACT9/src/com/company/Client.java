package com.company;

public class Client {
    public String usuaris;
    public String contrasenyes;
    public double saldo;

    public Client(String usuaris, String contrasenyes, double saldo) {
        this.usuaris = usuaris;
        this.contrasenyes = contrasenyes;
        this.saldo = saldo;
    }

    public String getUsuaris() {
        return usuaris;
    }

    public String getContrasenyes() {
        return contrasenyes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setUsuaris(String usuaris) {
        this.usuaris = usuaris;
    }

    public void setContrasenyes(String contrasenyes) {
        this.contrasenyes = contrasenyes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
