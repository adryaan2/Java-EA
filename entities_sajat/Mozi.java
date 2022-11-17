package com.java_ea.entities_sajat;

import javax.persistence.*;


@Entity
public class Mozi {
    @Column @Id
    public int id;
    @Column
    public String nev;
    @Column
    public String varos;
    @Column
    public int ferohely;

    public Mozi(int id, String nev, String varos, int ferohely) {
        this.id = id;
        this.nev = nev;
        this.varos = varos;
        this.ferohely = ferohely;
    }

    public Mozi() {
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
