package sample;

public class Client {

    private String nom;
    private String password;
    private double saldo;

    private int numIntents;
    private boolean bloquejat;

    private final int MAXINTENTS = 3; // definim una constant per desar màxim intents de login

    // Constructor d'un client
    // inicialitza els altributs segons els paràmetres passats
    // Posa a 0 el número d'intents i a false per indicar que l'usuari no està bloquejat
    public Client(String nom, String password, double saldo) {
        this.nom=nom;
        this.password=password;
        this.saldo=saldo;
        this.bloquejat=false;
        numIntents=0;

    }

    // Posar els Getters i setter de tots els atributs


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumIntents() {
        return numIntents;
    }

    public void setNumIntents(int numIntents) {
        this.numIntents = numIntents;
    }

    public boolean isBloquejat() {
        return bloquejat;
    }

    public void setBloquejat(boolean bloquejat) {
        this.bloquejat = bloquejat;
    }

    // mètode per posar diners
    public void incrementarSaldo(double quantitat) {
        saldo=saldo+quantitat;
    }

    // mètode per treure diners.
    // Comprova que hi hagi saldo per fer l'operació
    public boolean treureSaldo(double quantitat) {
        if (saldo>=quantitat){
            saldo=saldo-quantitat;
            return true;
        }
        return false;

    }

    // mètode per incrementar en 1 el número d'intents
    // Si s'arriba al màxim d'intents es bloqueja l'usuari
    public void incrementaIntents() {
        numIntents++;
        if (numIntents==MAXINTENTS){
            bloquejat=true;
        }
    }
}


