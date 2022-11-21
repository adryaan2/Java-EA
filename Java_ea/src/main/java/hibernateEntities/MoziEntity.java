package hibernateEntities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mozi", schema = "eabead", catalog = "")
public class MoziEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int id;
    @Basic
    @Column(name = "nev")
    public String nev;
    @Basic
    @Column(name = "varos")
    public String varos;
    @Basic
    @Column(name = "ferohely")
    public Integer ferohely;

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

    public Integer getFerohely() {
        return ferohely;
    }

    public void setFerohely(Integer ferohely) {
        this.ferohely = ferohely;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoziEntity that = (MoziEntity) o;
        return id == that.id && Objects.equals(nev, that.nev) && Objects.equals(varos, that.varos) && Objects.equals(ferohely, that.ferohely);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nev, varos, ferohely);
    }
}
