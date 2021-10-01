package com.company;

import java.util.Random;

public class GuessNumber {

    private int numeroAleatori; // Número aleatori generat
    private int minValor; // valor mínim que pot tenir l'aleatori
    private int maxValor; // valor màxim que pot tenir l'aleatori
    private String missatge; // Guardarà el missatge que es  mostrarà a l'usuari cada cop que es comprovi un número

    // Getters per als atributs que poden ser consultats des de fora de la classe
    public int getMaxValor() {
        return maxValor;
    }
    public int getMinValor() {
        return minValor;
    }
    public String getMissatge() {
        return missatge;
    }

    /* Mètode generarAleatori
     *   @return  retorna un número comprès entre les atributs minValor i maxValor
     */
    private int generarAleatori() {
        Random generador = new Random();
        int numero = generador.nextInt(this.maxValor-this.minValor)+this.minValor;
        return numero;
    }


    // Diferents constructors

    // Constructor Sense paràmetres
    // El valor aleatori generat estarà entre 1 i 100
    public GuessNumber() {
        minValor=1;
        maxValor=100;
        numeroAleatori=generarAleatori();
        missatge="Has de endevinar un num entre "+minValor+" i "+maxValor;


    }

    // Constructor per posar valors a minim i maxim
    // D'aquesta forma podem fer que endevinar el número ens consti més intents!
    public GuessNumber(int minim, int maxim) {
        minValor=minim;
        maxValor=maxim;
        numeroAleatori=generarAleatori();
        missatge="Has de endevinar un num entre "+minValor+" i "+maxValor;

    }



    /** Mètode comprova, mira si s'ha encertat el número passat per paràmetre
     * @param numero: Número que volem comprovar si hem encertat o no.
     * @return Si no l'hem encertat retorna false. Si l'hem encertat retorna true.
     * En missatge s'hi guardarà "has guanyat, el número cercat era ..", "El numero que he pensat és més petit ..." o "El núemero que he pensat  és més gran..."
     */
    public boolean comprova(int numero) {
        if (numero==numeroAleatori){
            missatge="Has encertat el número " +numeroAleatori;
            return true;
        }
        if (numero>numeroAleatori){
            missatge="El numero que has posat es mes petit";
        }
        else{
            missatge="El número es mes gran";

        }
        return false;
    }

    /** Mètode reiniciar()
     * Permet regenerar el número aleatori per si es vol tornar a jugar
     */
    public void reiniciar() {
        this.numeroAleatori = generarAleatori();
        missatge ="Joc Nou: He pensat un número entre "+ minValor
                +" i "+maxValor;
    }


}
