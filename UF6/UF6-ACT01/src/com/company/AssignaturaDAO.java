package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AssignaturaDAO {
    private Connection con = null;

    public boolean save(Assignatura assignatura) {
        String sql = "INSERT INTO assignatures(codi,nom) values (?,?)";

        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement ordre = con.prepareStatement(sql);
            ordre.setInt(1, assignatura.getCodi());
            ordre.setString(2, assignatura.getNom());
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

    public List<Assignatura> getAll() {

        String sql = "SELECT * FROM ASSIGNATURES";

        // ArrayList on aniré afegint els alumnes recuperats
        List<Assignatura> assignatura = new ArrayList<>();

        try {
            con = Connexio.connectar();
            Statement ordre = con.createStatement();
            ResultSet resultat = ordre.executeQuery(sql);
            while (resultat.next()) {
                Assignatura assignatura1 = new Assignatura();
                // Com totes les columnes són VARCHAR faig ús de getString
                // tinc altres com getInt, getDouble
                assignatura1.setCodi(resultat.getInt(1));
                assignatura1.setNom(resultat.getString(2));
                // guardo l'alumne a la llista
                assignatura.add(assignatura1);
            }
            // allibero els recursos
            ordre.close();
            resultat.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en obtenir llista alumnes.");
            // e.printStackTrace();
        }
        return assignatura;
    }



    public Assignatura get(int codi) {
        String sql = "SELECT * from assignatures where codi = ?" ;
        // Variable que retornaré
        Assignatura assignatura = null;

        try {
            con = Connexio.connectar();

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codi);

            ResultSet resultat = sentencia.executeQuery();

            // Només pot haver-hi un resultat com a màxim (o cap)
            if(resultat.next()) {
                assignatura = new Assignatura();
                assignatura.setCodi(resultat.getInt(1));
                assignatura.setNom(resultat.getString(2));

            } else {
                System.out.println("L'alumne no  existeix");
            }
            sentencia.close();
            con.close();


        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut eliminar l'alumne a la BD.");
            e.printStackTrace();
        }

        return assignatura;
    }


    public boolean delete(Assignatura assignatura) {

        String sql = "DELETE assignatures where codi = ?" ;

        try {
            con = Connexio.connectar();
            PreparedStatement ordre = con.prepareStatement(sql);
            ordre.setInt(1, assignatura.getCodi());
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


    public boolean update(Assignatura assignatura) {
        String sql = "UPDATE alumnes set nom=? WHERE codi=?" ;

        try {
            con = Connexio.connectar();
            // Com que l'SQL té paràmetres l'ordre serà de tipus PreparatedStatement
            PreparedStatement ordre = con.prepareStatement(sql);

            ordre.setString(1, assignatura.getNom());
            ordre.setInt(4, assignatura.getCodi());
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

}
