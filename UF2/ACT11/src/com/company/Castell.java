package com.company;

public class Castell {
    int codi;
    String descripció;
    int punts_carregats;
    int punts_descarregats;

    public Castell(int codi, String descripció, int punts_carregats, int punts_descarregats) {
        this.codi = codi;
        this.descripció = descripció;
        this.punts_carregats = punts_carregats;
        this.punts_descarregats = punts_descarregats;
    }

    public int getCodi() {
        return codi;
    }

    public String getDescripció() {
        return descripció;
    }

    public int getPunts_carregats() {
        return punts_carregats;
    }

    public int getPunts_descarregats() {
        return punts_descarregats;
    }
}
