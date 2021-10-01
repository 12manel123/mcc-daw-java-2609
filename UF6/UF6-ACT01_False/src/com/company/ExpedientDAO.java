package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpedientDAO {
    private Connection con = null;

    /**
     * getNotesAlumne: retorna llista de les notes assignades a un alumne
     * @param dni de l'alumne del que vull recuperar les notes de les assignatures matriculades
     * @return ArrayList amb objectes de tipus Expedient
     */
    public List<Expedient> getNotesAlumne(String dni) {
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT codi,nota_ordinaria,nota_extraordinaria FROM expedients where dni= ?";

        List<Expedient> expedients = new ArrayList<Expedient>();

        try {
            con = Connexio.connectar();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, dni);
            rs = sentencia.executeQuery();
            while (rs.next()) {
                Expedient expedient = new Expedient();
                //expedient.setDni(dni);
                expedient.setCodiAssignatura(rs.getInt(1));
                expedient.setNota_ordinaria(rs.getDouble(2));
                expedient.setNota_extraordinaria(rs.getDouble(3));

                expedients.add(expedient);
            }
            sentencia.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en obtenir llista notes alumne "+dni);
            e.printStackTrace();
        }

        return expedients;
    }

    /**
     * getNotesAssignatura: Donat el codi d'una assignatura retorna la llista amb els expedients
     * dels alumnes que la cursem (dni + nota)
     * @param codi de l'assignatura
     * @return ArrayList amb objectes de tipus Expedient
     */
    public List<Expedient> getNotesAssignatura(int codi) {

        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT dni,nota_ordinaria,nota_extraordinaria FROM expedients where codi= ?";

        List<Expedient> expedients = new ArrayList<Expedient>();

        try {
            con = Connexio.connectar();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codi);
            rs = sentencia.executeQuery();
            while (rs.next()) {
                Expedient expedient = new Expedient();
                //expedient.setCodiAssignatura(codi);
                expedient.setDni(rs.getString(1));
                expedient.setNota_ordinaria(rs.getDouble(2));
                expedient.setNota_extraordinaria(rs.getDouble(3));
                expedients.add(expedient);
            }
            sentencia.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en obtenir llista notes d'assignatura "+codi);
            e.printStackTrace();
        }
        return expedients;
    }


    public boolean canviarNota(String dni, int codiAssignatura,int convocatoria,double nota) {
        Statement stm = null;

        String sql = "UPDATE expedients set nota_ordinaria = ? WHERE dni=? AND codi=?";
        if (convocatoria!=1){
            sql = "UPDATE expedients set nota_extraordinaria=? WHERE dni=? AND codi=?";
        }

        try {
            con = Connexio.connectar();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setDouble(1,nota);
            sentencia.setString(2, dni);
            sentencia.setInt(3, codiAssignatura);
            sentencia.execute();

            sentencia.close();

            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error en obtenir llista notes alumne "+dni);
            e.printStackTrace();
            return false;
        }

    }





    public double getMax(int codi) {
        String sql = "SELECT max(nota_ordinaria) from expedients where codi = ?" ;
        // Variable que retornaré
        double expedient=0;

        try {
            con = Connexio.connectar();

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codi);

            ResultSet resultat = sentencia.executeQuery();

            // Només pot haver-hi un resultat com a màxim (o cap)
            if(resultat.next()) {
                expedient=resultat.getDouble(1);

            } else {
                System.out.println("L'ass no  existeix");
            }
            sentencia.close();
            con.close();


        } catch (SQLException e) {
            System.out.println("Error: No s'ha pogut mostrar la nota max a la BD.");
            e.printStackTrace();
        }

        return expedient;
    }

    /*
    public double notaMax(int codiAssignatura) {

        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT max(nota_ordinaria) FROM expedients where codi= ?";

        List<Expedient> expedients = new ArrayList<Expedient>();

        try {
            con = Connexio.connectar();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codiAssignatura);
            rs = sentencia.executeQuery();
            while (rs.next()) {
                Expedient expedient = new Expedient();
                //expedient.setCodiAssignatura(codi);
                expedient.setNota_ordinaria(rs.getDouble(1));
                expedients.add(expedient);
            }
            sentencia.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error en obtenir la max de notes d'assignatura "+codiAssignatura);
            e.printStackTrace();
        }
        return notaMax();
    }

     */



}
