package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumneDAO {

    private Connection con = null; // hi guardarem la connexió a la BD

    /**
     * getAll: recupera tots els registres d'una taula i els guarda en un ArrayList
     * @return L'arrayList amb tots els registres recuperats
     */
    public List<Alumne> getAll() {

        // sql amb la sentència SQL que es vol executar
        String sql = "SELECT * FROM ALUMNES";

        // ArrayList on aniré afegint els alumnes recuperats
        List<Alumne> alumnes = new ArrayList<Alumne>();

        try {
            // intento connectar
            con = Connexio.connectar();
            // creo una ordre per enviar
            Statement ordre = con.createStatement();
            // i l'executo. Retorna un conjunt de registres: pot estar buid, tenir 1 registre o més..
            // Com és una consulta faig servir executeQuery
            ResultSet resultat = ordre.executeQuery(sql);
            // Recupero els resultat registre a registre.
            // Cada cop que s'executa next() es recupera el següent registre de la taula
            while (resultat.next()) {
                // Creo un alumne
                Alumne alumne = new Alumne();
                // Com totes les columnes són VARCHAR faig ús de getString
                // tinc altres com getInt, getDouble
                alumne.setDni(resultat.getString(1));
                alumne.setNom(resultat.getString(2));
                alumne.setAdreça(resultat.getString(3));
                alumne.setTelefon(resultat.getString(4));
                // guardo l'alumne a la llista
                alumnes.add(alumne);
            }
            // allibero els recursos
            ordre.close();
            resultat.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en obtenir llista alumnes.");
            // e.printStackTrace();
        }

        return alumnes;
    }



    /**
     * Save: afegeix un nou alumne a la BD
     * @param alumne Alumne que volem afegir
     * @return true si ha pogut emmagatzemar-lo, false en cas contrari
     *
     */
    public boolean save(Alumne alumne) {
        // Sql amb la sentència SQL
        // Quan la sentència SQL té paràmetres poso ? en el lloc on aniria el valor que vull guardar
        // Això em permetrà fer ús de ordres variables: PreparedStatement
        String sql = "INSERT INTO alumnes(dni,nom,adreça,telefon) " +
                "values (?,?,?,?)";


        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement ordre = con.prepareStatement(sql);
            ordre.setString(1, alumne.getDni());
            ordre.setString(2, alumne.getNom());
            ordre.setString(3, alumne.getAdreça());
            ordre.setString(4, alumne.getTelefon());
            // Executo l'insert. Com no és una consulta faig servir execute
            ordre.execute();

            ordre.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut afegir l'alumne a la BD.");
            // e.printStackTrace();
            return false;
        }

    }

    /**
     * get: Obtenir un alumne segons els seu dni
     * @param dni : valor del dni de l'alumne que vull recuperar
     * @return
     */
    public Alumne get(String dni) {
        // SQl amb la consulta que vull executar
        String sql = "SELECT * from alumnes where dni = ?" ;
        // Variable que retornaré
        Alumne alumne = null;

        try {
            con = Connexio.connectar();

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, dni);

            ResultSet resultat = sentencia.executeQuery();

            // Només pot haver-hi un resultat com a màxim (o cap)
            if(resultat.next()) {
                alumne = new Alumne();
                alumne.setDni(resultat.getString(1));
                alumne.setNom(resultat.getString(2));
                alumne.setAdreça(resultat.getString(3));
                alumne.setTelefon(resultat.getString(4));

            } else {
                System.out.println("L'alumne no  existeix");
            }
            sentencia.close();
            con.close();


        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut eliminar l'alumne a la BD.");
            e.printStackTrace();
        }

        return alumne;
    }

    /**
     * delete: esborra un objecte de la classe Alumne
     * @param alumne
     * @return true si s'ha pogut esborrar, false altrament
     */
    public boolean delete(Alumne alumne) {

        String sql = "DELETE alumnes where dni = ?" ;

        try {
            con = Connexio.connectar();
            PreparedStatement ordre = con.prepareStatement(sql);
            ordre.setString(1, alumne.getDni());

            ordre.execute();

            ordre.close();
            con.close();
            return true;

        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut eliminar l'alumne a la BD.");
            //e.printStackTrace();
            return false;
        }

    }


    // Implementa aquí el mètode per actualitzar les dades d'un alumne

    /**
     * update: actualitza les dades d'un alumne
     * @param alumne Objecte que conté les dades de l'alumne que volem modificar
     *
     * @return true en cas d'èxit
     */
    public boolean update(Alumne alumne) {
        String sql = "UPDATE alumnes set nom=?,adreça=?, telefon=? WHERE dni=?" ;

        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement ordre = con.prepareStatement(sql);

            ordre.setString(1, alumne.getNom());
            ordre.setString(2, alumne.getAdreça());
            ordre.setString(3, alumne.getTelefon());
            ordre.setString(4, alumne.getDni());
            // Executo l'insert. Com no és una consulta faig servir execute
            ordre.execute();

            ordre.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut actualizar l'alumne a la BD.");
            // e.printStackTrace();
            return false;
        }

    }




    public boolean tablacorreo(){
        String sql = "ALTER TABLE alumnes ADD CORREU varchar2(30)" ;

        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement ordre = con.prepareStatement(sql);
            // Executo l'insert. Com no és una consulta faig servir execute
            ordre.execute();
            ordre.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut actualizar l'alumne a la BD.");
            // e.printStackTrace();
            return false;
        }
    }




    public boolean updateCorreo(String dni, String correu) {
        String sql = "UPDATE alumnes set correu=? WHERE dni=?" ;

        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement sentencia = con.prepareStatement(sql);

            sentencia.setString(1,correu);
            sentencia.setString(2,dni);
            // Executo l'insert. Com no és una consulta faig servir execute
            sentencia.execute();

            sentencia.close();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut actualizar l'alumne a la BD.");
            // e.printStackTrace();
            return false;
        }

    }




}