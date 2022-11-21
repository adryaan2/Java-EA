package com.java_ea;

public class EloadasModel {
    private String fCim;
    private int fEv;
    private String datum;
    private int bev;
    private String mNev;
    private String mVaros;

    public EloadasModel(String fCim, int fEv, String datum, int bev, String mNev, String mVaros) {
        this.fCim = fCim;
        this.fEv = fEv;
        this.datum = datum;
        this.bev = bev;
        this.mNev = mNev;
        this.mVaros = mVaros;
    }

    @Override
    public String toString() {
        return  "fCim='" + fCim + '\'' +
                ", fEv=" + fEv +
                ", datum='" + datum + '\'' +
                ", bev=" + bev +
                ", mNev='" + mNev + '\'' +
                ", mVaros='" + mVaros + '\'';
    }
}
