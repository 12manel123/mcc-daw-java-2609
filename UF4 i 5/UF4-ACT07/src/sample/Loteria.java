package sample;

import java.util.Random;

public class Loteria {
    private int[] aleatoris = new int[6]; // guardarà els 6 números aleatoris generats
    protected int[] apostes = new int[6]; // guardarà els 6 números triats per l'usuari

    /**
     * Mètode Cercar
     * retorna cert si el numero cercat es troba dins les primeres posicions d'un array
     *
     * @param cercat: número que es vol buscar dins l'array
     * @param array:  array on es vol buscar el número
     * @param inici   Es busca l'element des de la posició indicada
     * @param fi      Es busca únicament fins a la posició indicada
     * @return true si el número éstà dins l'array entre inici ... fi
     */

    private boolean cercar(int cercat, int[] array, int inici, int fi) {
        for (int i = inici; i < fi; i++) {
            if (cercat == array[i]) return true;
        }
        return false;
    }

    /**
     * Mètode sortejar
     * Genera els 6 números aleatoris diferents i els guarda en aleatoris
     */
    public void sortejar() {

        Random generador = new Random();
        for (int i = 0; i < aleatoris.length; i++) {
            aleatoris[i] = generador.nextInt(48) + 1;
        }
    }

    /**
     * Mètode setApostes
     * Mètode que serveix per recollir els números que l'usuari ha triat
     * Es comprovarà que tots els números estan compresos entre 1..49
     * i que no n'hi hagi cap de repetit
     *
     * @param aposta Números apostats per l'usuari
     * @return retorna true si els números són corretes i fals si hi ha algun número incorrecte
     */
    public boolean setApostes(int[] aposta) {

        int i = 0;

        //Bucle per recorrer array apostes
        while (i < aposta.length) {
            int j = 0;

            //Bucle per recorrer l'array per cada posició "i"
            while (j < aposta.length) {

                //Retorna fals si el número es repeteix
                if (aposta[i] == aposta[j] && j != i) {
                    return false;
                }

                //Retorna fals si el número no està entre 0-49
                if (aposta[i] < 0 || aposta[i] > 49) {
                    return false;
                }
                j++;
            }

            //Si es validen els valors es guarden en el nostre array d'apostes
            apostes[i] = aposta[i];
            i++;
        }

        return true;
    }

    /**
     * Mètode getAleatoris
     *
     * @return els números aleatoris resultants del sorteig
     */
    public int[] getAleatoris() {
        return aleatoris;
    }

    /**
     * @return el número d'encerts del sorteig
     */
    int numeroEncerts() {

        //Variable per guardar encerts
        int encerts = 0;

        //Recorre array dels nombres apostats
        for (int i = 0; i < apostes.length; i++) {

            //Utilitzem mètode per buscar encerts en l'array d'aleatoris i augmentem el contador
            if (cercar(apostes[i], aleatoris, 0, 5)) encerts++;
        }
        return encerts;
    }
}

