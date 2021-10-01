package com.company;

import java.util.Scanner;

public class Main {
    Scanner teclat = new Scanner(System.in);

    /**
     * Simula un caixer amb les opcions d'inici de sessió, consultar saldo,
     * retirar, ingressar i canviar contrasenya
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main programa = new Main();
        String[] usuaris = { "jlopez", "rgomez", "amarti" };
        String[] contrasenyes = { "aaa", "bbb", "ccc" };
        double[] saldo = { 1900, 4500, 10800 };
        int[] bitllets = { 50, 20, 10 };

        /**
         *  Demana a l'usuari que iniciï sessió amb nom i contrasenya. A continuació
         *  mostra un menú amb les diferents opcions. Quan es selecciona una opció,
         *  es crida al mètode corresponent i en acabar es torna a mostrar el menú.
         *  Si es selecciona l'opció sortir es torna a demanar nom d'usuari i
         *  contrasenya.
         */
        while (true) {
            int usuariActiu = programa.iniciaSessio(usuaris, contrasenyes);
            char opcio = programa.menu();
            while ( opcio != '5') {
                switch (opcio) {
                    case '1':
                        programa.consultaSaldo(usuariActiu, saldo);
                        break;
                    case '2':
                        programa.retirarDiners(usuariActiu, saldo, bitllets);
                        break;
                    case '3':
                        programa.ingressar(usuariActiu, saldo);
                        break;
                    case '4':
                        programa.canviarClau(usuariActiu, contrasenyes);
                        break;
                    case '5':
                        System.out.println("Adeu");
                        break;
                    default:
                        System.out.println("Opció incorrecta");
                }

                opcio = programa.menu();
            }
        }
    }

    /**
     * Demana per teclat un nom i una contrasenya i comprova si és vàlid.
     * Mentre no s'introdueixi un nom d'usuari i contrasenya mostrarà un
     * missatge d'error i tornarà a demanar
     * @param usuaris un vector amb els noms de tots els usuaris
     * @param contrasenyes un vector amb les contrasenyes de tots els usuaris
     * @return l'identificador de l'usuari validat
     */
    int iniciaSessio(String[] usuaris, String[] contrasenyes) {
        String user;
        String password;
        boolean useryes = false;
        boolean passwordyes = false;
        int usernum = 0;
        while (!useryes) {
            System.out.print("Introdueix usuari: ");
            user = teclat.nextLine();
            for (int i = 0; i < usuaris.length; i++) {
                if (user.equalsIgnoreCase(usuaris[i])) {
                    useryes = true;
                    usernum = i;
                    System.out.println("Usuari correcte");
                }
            }
        }
        while (!passwordyes){
            System.out.println("Introdueix contrasenya per " + usuaris[usernum]);
            password = teclat.nextLine();
            if (password.equals(contrasenyes[usernum])){
                passwordyes = true;
                System.out.println("Contrasenya correcte");
            }
        }
        return usernum;
    }

    /**
     * Mostra un menú amb totes les opcions i demana per teclat que es seleccioni
     * una opció
     * @return l'opció introduida per teclat: '1', '2', '3', '4' o '5'
     */
    char menu() {
        char respostamenu;
        System.out.println("---------------------------------");
        System.out.println("Selecciona una opció");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar diners");
        System.out.println("3. Ingressar");
        System.out.println("4. Canviar clau");
        System.out.println("5. Sortir");
        respostamenu = teclat.next().charAt(0);
        return respostamenu;
    }

    /**
     * Mostra el saldo d'un usuari
     * @param usuariActiu número d'usuari del qual es mostrarà el saldo
     * @param saldo vector que conté els saldos de tots els usuaris
     */
    void consultaSaldo(int usuariActiu, double[] saldo) {
        System.out.println("El teu saldo és de " + saldo[usuariActiu] + "€.");
    }

    /**
     * Demana una quantitat per a retirar i si hi ha prou saldo, mostra per
     * pantalla els bitllets que s'entregaran. Dedueix la quantitat retirada
     * del saldo
     * @param usuariActiu número d'usuari que fa la retirada d'efectiu
     * @param saldo vector amb els saldos de tots els usuaris
     * @param bitllets vector amb els tipus de bitllets disponibles
     */
    void retirarDiners(int usuariActiu, double[] saldo, int[] bitllets) {
        int retirars;
        int retirar;
        int d50 = 0;
        int d20 = 0;
        int d10 = 0;

        System.out.println("Introdueix els diners a retirar:");
        retirar = teclat.nextInt();
        retirars = retirar;
        if (retirar > saldo[usuariActiu]){
            System.out.println("La quantitat a retirar és molt gran, retira menys.");
        }

        else{
            saldo[usuariActiu] = saldo[usuariActiu] - retirar;
            while (retirar >= 50){
                d50++;
                retirar = retirar-50;
            }
            while (retirar >= 20){
                d20++;
                retirar = retirar - 20;
            }
            while (retirar >= 10){
                d10++;
                retirar = retirar - 10;
            }
            if (retirar >0){
                System.out.println("No valid, només billets de 50, 20 i 10");
                saldo[usuariActiu] = saldo[usuariActiu] + retirars;
            }
            if (retirar == 0) {
                System.out.println(d50 + " billets de 50€.");
                System.out.println(d20 + " billets de 20€.");
                System.out.println(d10 + " billets de 10€.");
            }
        }
    }

    /**
     * Demana per teclat la quantitat a ingressar i l'afegeix al saldo de
     * l'usuari actiu
     * @param usuariActiu el número d'usuari
     * @param saldo vector que conté els saldos de tots els usuaris
     */
    void ingressar(int usuariActiu, double[] saldo) {
        double ingresar = 0;
        System.out.println("Introdueix quantitat a ingressar: ");
        ingresar = teclat.nextDouble();
        saldo[usuariActiu] = saldo[usuariActiu] + ingresar;
        System.out.println("S'ha ingressat " + ingresar + "€ al compte.");
    }

    /**
     * Demana una nova contrasenya per teclat i l'actualitza
     * @param usuariActiu el número de l'usuari que fa el canvi de contrasenya
     * @param contrasenyes vector que conté les contrasenyes de tots els usuaris
     */
    void canviarClau(int usuariActiu, String[] contrasenyes) {
        System.out.println("Introdueix nova contrasenya:");
        contrasenyes[usuariActiu] = teclat.next();
        System.out.println("Contrasenya actualitzada.");
    }
}