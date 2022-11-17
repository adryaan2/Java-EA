package com.java_ea.entities_sajat;
import javax.persistence.*;

@Entity
@IdClass(EloadasId.class)
public class Eloadas {
    @Column@Id
    public int filmid;
    @Column@Id
    public int moziid;
    @Column
    public String datum;
    @Column
    public int nezoszam;
    @Column
    public int bevetel;

    public Eloadas(int filmid, int moziid, String datum, int nezoszam, int bevetel) {
        this.filmid = filmid;
        this.moziid = moziid;
        this.datum = datum;
        this.nezoszam = nezoszam;
        this.bevetel = bevetel;
    }

    public Eloadas() {
    }

    public int getFilmid() {
        return filmid;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public int getMoziid() {
        return moziid;
    }

    public void setMoziid(int moziid) {
        this.moziid = moziid;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getNezoszam() {
        return nezoszam;
    }

    public void setNezoszam(int nezoszam) {
        this.nezoszam = nezoszam;
    }

    public int getBevetel() {
        return bevetel;
    }

    public void setBevetel(int bevetel) {
        this.bevetel = bevetel;
    }
}
