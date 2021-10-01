package com.company;

import java.util.Scanner;

public class Main {

    Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        Main programa = new Main();
        Client [] clients = {
                new Client("jlopez","aaa",1900),
                new Client("rgomez","bbb",4500)
        };
        int[] bitllets = { 50, 20, 10 };


        while (true) {
            int usuariActiu = programa.iniciaSessio(clients);
            char opcio = programa.menu();
            while ( opcio != '5') {
                switch (opcio) {
                    case '1':
                        programa.consultaSaldo(usuariActiu, clients);
                        break;
                    case '2':
                        programa.retirarDiners(usuariActiu, clients, bitllets);
                        break;
                    case '3':
                        programa.ingressar(usuariActiu, clients);
                        break;
                    case '4':
                        programa.canviarClau(usuariActiu, clients);
                        break;
                    case '5':
                        System.out.println("Fins aviat");
                        break;
                    default:
                        System.out.println("Opció incorrecta");
                }

                opcio = programa.menu();
            }
        }
    }

    int iniciaSessio(Client[] clients) {
        String user;
        String password;
        boolean useryes = false;
        boolean passwordyes = false;
        int usernum = 0;
        while (!useryes) {
            System.out.print("Introdueix usuari: ");
            user = teclat.nextLine();
            for (int i = 0; i < clients.length; i++) {
                if (user.equalsIgnoreCase(clients[i].getUsuaris())) {
                    useryes = true;
                    usernum = i;
                    System.out.println("Usuari correcte");
                }
            }
        }
        while (!passwordyes){
            System.out.println("Introdueix contrasenya per " + clients[usernum].getUsuaris());
            password = teclat.nextLine();
            if (password.equals(clients[usernum].getContrasenyes())){
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


    void consultaSaldo(int usuariActiu, Client[] clients) {
        System.out.println("El teu saldo és de " + clients[usuariActiu].getSaldo() + "€.");
    }


    void retirarDiners(int usuariActiu, Client[] clients, int[] bitllets) {
        int retirars;
        int retirar;
        int d50 = 0;
        int d20 = 0;
        int d10 = 0;

        System.out.println("Introdueix els diners a retirar:");
        retirar = teclat.nextInt();
        retirars = retirar;
        if (retirar > clients[usuariActiu].getSaldo()){
            System.out.println("La quantitat a retirar és molt gran, retira menys.");
        }

        else{
            clients[usuariActiu].setSaldo( clients[usuariActiu].getSaldo() - retirar);
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
                clients[usuariActiu].setSaldo( clients[usuariActiu].getSaldo() + retirar);
            }
            if (retirar == 0) {
                System.out.println(d50 + " billets de 50€.");
                System.out.println(d20 + " billets de 20€.");
                System.out.println(d10 + " billets de 10€.");
            }
        }
    }


    void ingressar(int usuariActiu, Client[] clients) {
        double ingresar = 0;
        System.out.println("Introdueix quantitat a ingressar: ");
        ingresar = teclat.nextDouble();
        clients[usuariActiu].setSaldo( clients[usuariActiu].getSaldo() + ingresar);
        System.out.println("S'ha ingressat " + ingresar + "€ al compte.");
    }


    void canviarClau(int usuariActiu, Client[] clients) {
        System.out.println("Introdueix nova contrasenya:");
        clients[usuariActiu].setContrasenyes(teclat.next());
        System.out.println("Contrasenya actualitzada.");
    }
}
