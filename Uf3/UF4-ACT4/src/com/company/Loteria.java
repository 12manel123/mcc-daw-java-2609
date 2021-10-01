package com.company;

import java.util.Random;

public class Loteria {

    private int[] aleatoris = new int[6]; // guardarà els 6 números aleatoris generats
    private int[] apostes = new int[6]; // guardarà els 6 números triats per l'usuari

    /**
     * Mètode Cercar
     * retorna cert si el numero cercat es troba dins les primeres posicions d'un array
     * @param cercat: número que es vol buscar dins l'array
     * @param array: array on es vol buscar el número
     * @param inici Es busca l'element des de la posició indicada
     * @param fi Es busca únicament fins a la posició indicada
     * @return true si el número éstà dins l'array entre inici ... fi
     * */

    private boolean cercar(int cercat,int[] array,int inici, int fi) {
        for(int i=inici;i<fi;i++) {
            if(cercat==array[i]) return true;
        }
        return false;
    }

    /**
     * Mètode sortejar
     * Genera els 6 números aleatoris diferents i els guarda en aleatoris
     */
    public void sortejar() {



    }

    /**
     * Mètode setApostes
     * Mètode que serveix per recollir els números que l'usuari ha triat
     * Es comprovarà que tots els números estan compresos entre 1..49
     * i que no n'hi hagi cap de repetit
     * @param apostes Números apostats per l'usuari
     * @return retorna true si els números són corretes i fals si hi ha algun número incorrecte
     */
    public boolean setApostes(int[] apostes) {

        return false;
    }

    /**
     * Mètode getAleatoris
     * @return els números aleatoris resultants del sorteig
     */
    public int[] getAleatoris() {
        return aleatoris;
    }

    /**
     *
     * @return el número d'encerts del sorteig
     */
    int numeroEncerts() {
        return 0;
    }
}
