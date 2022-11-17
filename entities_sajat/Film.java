package com.java_ea.entities_sajat;
import javax.persistence.*;

@Entity
public class Film {
    @Id @Column
    public int id;
    @Column
    public String cim;
    @Column
    public int ev;
    @Column
    public int szam;

    public Film(int id, String cim, int ev, int szam) {
        this.id = id;
        this.cim = cim;
        this.ev = ev;
        this.szam = szam;
    }

    public Film() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getEv() {
        return ev;
    }

    public void setEv(int ev) {
        this.ev = ev;
    }

    public int getSzam() {
        return szam;
    }

    public void setSzam(int szam) {
        this.szam = szam;
    }
}
