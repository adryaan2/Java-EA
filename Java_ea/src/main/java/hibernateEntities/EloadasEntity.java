package hibernateEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "eloadas", schema = "eabead", catalog = "")
@IdClass(EloadasId.class)
public class EloadasEntity {
    @Id
    @Column(name = "filmid")
    public int filmid;
    @Id
    @Column(name = "moziid")
    public int moziid;
    @Basic
    @Column(name = "datum")
    public String datum;
    @Basic
    @Column(name = "nezoszam")
    public Integer nezoszam;
    @Basic
    @Column(name = "bevetel")
    public Integer bevetel;

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
