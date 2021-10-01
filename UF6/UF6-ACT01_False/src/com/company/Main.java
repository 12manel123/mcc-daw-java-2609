package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ---------------------------CLASSE CONNECTAR----------------------------
        Connexio.connectar();


        // ----------------------------CLASE ASSIGNATURA + ASSIGNATURA DAO--------------------------


        AssignaturaDAO assignaturaDAO=new AssignaturaDAO();

        List<Assignatura> alumne = assignaturaDAO.getAll();
        for(int i=0;i< alumne.size();i++){
            System.out.println(alumne.get(i).getCodi()+" "+alumne.get(i).getNom());
        }
        Assignatura arn = new Assignatura(4,"Maria jose");
        assignaturaDAO.save(arn);

        alumne = assignaturaDAO.getAll();
        for(int i=0;i< alumne.size();i++){
            System.out.println(alumne.get(i).getCodi()+" "+alumne.get(i).getNom());

        }






        // -------------------------GET NOTA DE ALUMNE -----------------------
        AlumneDAO alumneDAO=new AlumneDAO();
        Alumne AlumneRecuperat = alumneDAO.get("11111111A");
        List <Expedient> notes = AlumneRecuperat.getNotes();
        for (int i=0;i< notes.size();i++){
            int codi=notes.get(i).getCodiAssignatura();
            Assignatura assignatura1 = assignaturaDAO.get(notes.get(i).getCodiAssignatura());
            System.out.println(notes.get(i).getCodiAssignatura()+ assignatura1.getNom()+" "+"   "+notes.get(i).getNota_ordinaria());
        }

        //--------------------------------UPDATE NOTES --------------------------


        AlumneRecuperat.setNotesConvocatoria(3,2,6);


        //---------------------------------GET NOTES DE ASSUGNATURA ----------------------
        Assignatura assignaturaRecuperat = assignaturaDAO.get(2);
        List <Expedient> notesAss = assignaturaRecuperat.getNotes();
        for (int i=0;i< notesAss.size();i++){
            System.out.println(notesAss.get(i).getDni()+"  "+notesAss.get(i).getNota_ordinaria());

        }



        //---------------------------------ALUMNE + ALUMNE DAO ------------------------

        List<Alumne> alumne2 = alumneDAO.getAll();
        for(int i=0;i< alumne2.size();i++){
            System.out.println(alumne2.get(i).getDni()+" "+alumne2.get(i).getNom());
        }

        Alumne a = new Alumne("44444444O","Montse Rodriguez Sol","Major,78","9773456923");
        alumneDAO.save(a);

        Alumne b = alumneDAO.get("44444444O");
        System.out.println(b);
        if(b!=null) System.out.println(b.getNom());
        else System.out.println("No existeix");

        alumneDAO.delete(b);

        Alumne al1 = alumneDAO.get("11111111A");
        al1.setTelefon("999999999");
        al1.setAdreça("Llarg, 56");
        alumneDAO.delete(al1);

        Alumne f= new Alumne("11111111A","Manel Pepito Juan","Major,78","9773456923");
        alumneDAO.update(f);

        List<Alumne> alumne3 = alumneDAO.getAll();
        for(int i=0;i< alumne3.size();i++){
            System.out.println(alumne3.get(i).getDni()+" "+alumne3.get(i).getNom());
        }


        //------------------------METODE LLIURE 1 Nota MAX de Assignatura-----------------------------

        Assignatura assignaturaMax = assignaturaDAO.get(1);
        System.out.println(assignaturaMax.maxNotes(1));


        //----------------------METODE LLIURE 2 Correu------------------------------

        alumneDAO.tablacorreo();
        AlumneDAO alumneCorreu=new AlumneDAO();
        alumneCorreu.updateCorreo("11111111A", "11@gmail.com");




    }
}
