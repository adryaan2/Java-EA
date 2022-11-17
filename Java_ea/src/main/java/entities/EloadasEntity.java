package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "eloadas", schema = "eabead", catalog = "")
public class EloadasEntity {
    @Basic
    @Column(name = "filmid")
    private int filmid;
    @Basic
    @Column(name = "moziid")
    private int moziid;
    @Basic
    @Column(name = "datum")
    private String datum;
    @Basic
    @Column(name = "nezoszam")
    private Integer nezoszam;
    @Basic
    @Column(name = "bevetel")
    private Integer bevetel;

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

    public Integer getNezoszam() {
        return nezoszam;
    }

    public void setNezoszam(Integer nezoszam) {
        this.nezoszam = nezoszam;
    }

    public Integer getBevetel() {
        return bevetel;
    }

    public void setBevetel(Integer bevetel) {
        this.bevetel = bevetel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EloadasEntity that = (EloadasEntity) o;
        return filmid == that.filmid && moziid == that.moziid && Objects.equals(datum, that.datum) && Objects.equals(nezoszam, that.nezoszam) && Objects.equals(bevetel, that.bevetel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmid, moziid, datum, nezoszam, bevetel);
    }
}
