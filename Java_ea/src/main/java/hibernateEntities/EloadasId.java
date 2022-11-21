package hibernateEntities;

import java.io.Serializable;
import java.util.Objects;

public class EloadasId implements Serializable {
    public int filmid;
    public int moziid;

    public EloadasId(int filmid, int moziid) {
        this.filmid = filmid;
        this.moziid = moziid;
    }

    public EloadasId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EloadasId eloadasId = (EloadasId) o;
        return filmid == eloadasId.filmid && moziid == eloadasId.moziid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmid, moziid);
    }
}
