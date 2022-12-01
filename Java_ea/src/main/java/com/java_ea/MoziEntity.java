package com.java_ea;

public class MoziEntity {

    public int id;

    public String nev;

    public String varos;

    public int ferohely;

    public MoziEntity(int id, String nev, String varos, int ferohely) {
        this.id = id;
        this.nev = nev;
        this.varos = varos;
        this.ferohely = ferohely;
    }

    public MoziEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }
}
