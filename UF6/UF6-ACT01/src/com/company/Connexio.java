package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Classe per connectar-se a una BD d'un tipus específic i que opera en una URL específica:

// Per permetre la independència de la plataforma, JDBC proporciona un gestor de controladors
// que gestiona dinàmicament tots els aspectes específics de l’accés a un tipus de BD concret.
// En usar JDBC, la instrucció “Class.forName” és l’única que canvia, d’acord al tipus concret
//        de BD al qual s’accedeix. La resta d’instruccions del programa serà exactament igual

// El paràmetre “url” és una cadena de text amb l’identificador de la ubicació de la BD.
// Quan es configura una BD, aquesta normalment ens informa de quin és aquest identificador,
// que dependrà en part de la màquina on s’ha instal·lat.

public class Connexio {
    // JDBC driver i database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    //  usuari i password usuari BD
    static final String USER = "sa";
    static final String PASS = "";


    /**
     * connectar: retorna un objecte de classe Connection
     * Amb aquest objecte podré operar amb la base de dades connectaada
     * @return
     */
    public static Connection connectar() {

        Connection conn = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connectant a la base de dades...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            if (conn != null) {
                System.out.println("Connectat correctament a la base de dades");
            }
        } catch (SQLException e) {
            System.out.println("No s'ha pogut connectar amb la bade de dades");
            e.printStackTrace();

        } catch(Exception e) {
            System.out.println("No es troba la classe per connectar amb H2");
        }
        return conn;
    }
}

/**
 Els atributs estàtics:
 un atribut estàtic ocupa memòria encara que no tinguem cap objecte d'aquella classe.
 Si tenim però diferents objectes d'aquesta classe tots els objectes comparteixen el mateix atribut estàtic.
 Exemple:
 public class Matematica {
 public static float PI = 3.1416f;
 }
 ús:
 System.out.println(Matematica.PI);
 **/

/**
 Els mètodes estàtics:
 un mètode estàtic es pot cridar encara que no tinguem creat (new) cap objecte d'aquella classe.
 public class Matematica {
 public static int sumar(int x1, int x2) {
 int s = x1 + x2;
 return s;
 }
 }
 ús:
 System.out.println(Matematica.sumar(2, 4));
 **/
