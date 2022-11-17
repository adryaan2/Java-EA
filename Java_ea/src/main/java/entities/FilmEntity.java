package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "film", schema = "eabead", catalog = "")
public class FilmEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "cim")
    private String cim;
    @Basic
    @Column(name = "ev")
    private Integer ev;
    @Basic
    @Column(name = "hossz")
    private Integer hossz;

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

    public Integer getEv() {
        return ev;
    }

    public void setEv(Integer ev) {
        this.ev = ev;
    }

    public Integer getHossz() {
        return hossz;
    }

    public void setHossz(Integer hossz) {
        this.hossz = hossz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmEntity that = (FilmEntity) o;
        return id == that.id && Objects.equals(cim, that.cim) && Objects.equals(ev, that.ev) && Objects.equals(hossz, that.hossz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cim, ev, hossz);
    }
}
