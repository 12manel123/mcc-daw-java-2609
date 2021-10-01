package com.company;

public class Test {
    public int[] respostes = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public int numP = 0;

    Pregunta[] preguntes = inicialitza();

    private Pregunta[] inicialitza() {
        return new Pregunta[]{
                new Pregunta("Qui va pintar el Guernica", new String[]{"Velàzquez", "Goya", "Picasso"}, 2),
                new Pregunta("Qui va escriure Alicia al país de les meravelles", new String[]{"Grimm", "Stevenson", "Carrol"}, 2),
                new Pregunta("Quina és la magnitud que relaciona espai i temps", new String[]{"velocitat", "temperatura", "pes"}, 0),
                new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és", new String[]{"4", "8", "12", "14"}, 1),
                new Pregunta("Quants segons té 1 hora", new String[]{"420", "760", "3600"}, 2),
                new Pregunta("Quin no és un llenguatge de programació", new String[]{"java", "php", "samsung"}, 2),
                new Pregunta("Dins un termòmetre hi trobem", new String[]{"aigua", "aigua amb gas", "mercuri"}, 2),
                new Pregunta("L'Acropolis es troba a", new String[]{"Atenes", "Roma", "París"}, 0),
                new Pregunta("L'element químic amb símbol Fe és ", new String[]{"Estronci", "Ferro", "Feril·li"}, 1),
                new Pregunta("La capital d'Estats Units és", new String[]{"Gerorgetown", "New York", "Washington"}, 2)
        };
    }



    //retorna un String amb el valor de l'atribut enunciat de la pregunta actual (dependrà del valor de l'atribut numPregunta
    public String getEnunciatPreguntaActual() { return preguntes[numP].getEnuciat(); }



    //retorna un array d'Strings amb les opcions de resposta possibles.
    public String[] getRespostesPreguntaActual() {
        return preguntes[numP].getRespostes();
    }



    //retorna quina pregunta toca contestar del test.
    public int getNumeroPregunta() { return numP + 1; }



    //respon la pregunta que toca, passant com a paràmetre la resposta que l'usuari ha triat.
    public void respondre(int resposta) { respostes[numP] = resposta; }



    //avança una pregunta cap endavant. Retorna cert si s'ha pogut tirar endavant (no s'ha arribat a la darrera pregunta).
    public boolean anarEndavant() {

        if (numP<9) {
            numP++;
            return true;
        }
        return false;
    }


    //es retrocedeix per a que l'usuari pugui contestar altre cop si vol una pregunta deixada en blanc o canviar la resposta.
    public boolean anarEndarrera() {

        if (numP > 0) {
            numP--;
            return true;
        }
        return false;
    }



    //retorna la puntuació obtinguda en el test.
    public double solucionarTest() {

        double suma = 0;
        double correcta = 10 / preguntes.length;

        for (int i = 0; i < respostes.length; i++) {

            if (respostes[i] == preguntes[i].getCorrecta()) {
                suma = suma + correcta;
            }

            if (respostes[i] != preguntes[i].getCorrecta() && respostes[i] != -1) {
                suma = suma - (correcta / preguntes[i].getRespostes().length);
            }
        }

        return suma;
    }
}
