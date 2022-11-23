package com.java_ea;

public class EloadasModel {
    public String fcim;
    public int fev;
    public String datum;
    public int bev;
    public String mnev;
    public String mvaros;

    public EloadasModel(String fcim, int fev, String datum, int bev, String mnev, String mvaros) {
        this.fcim = fcim;
        this.fev = fev;
        this.datum = datum;
        this.bev = bev;
        this.mnev = mnev;
        this.mvaros = mvaros;
    }

    @Override
    public String toString() {
        return  "fCim='" + fcim + '\'' +
                ", fEv=" + fev +
                ", datum='" + datum + '\'' +
                ", bev=" + bev +
                ", mNev='" + mnev + '\'' +
                ", mVaros='" + mvaros + '\'';
    }

    public String getFcim() {
        return fcim;
    }

    public int getFev() {
        return fev;
    }

    public String getDatum() {
        return datum;
    }

    public int getBev() {
        return bev;
    }

    public String getMnev() {
        return mnev;
    }

    public String getMvaros() {
        return mvaros;
    }
}
