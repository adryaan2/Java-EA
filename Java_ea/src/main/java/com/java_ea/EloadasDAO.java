package com.java_ea;

import java.sql.*;
import java.util.ArrayList;

public class EloadasDAO {
    private Connection conn;

    public EloadasDAO() {
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost/eabead?user=root");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<EloadasModel> getTopData(int top){
        try{
            ArrayList<EloadasModel> li = new ArrayList<>();
            Statement st = conn.createStatement();

            String sql="SELECT cim, ev, datum, bevetel, nev, varos FROM (film INNER JOIN eloadas ON film.id=filmid) INNER JOIN mozi ON mozi.id=moziid LIMIT "+top;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String fCim=rs.getString(1);
                int fEv = rs. getInt(2);
                String datum = rs.getString(3);
                int bevetel= rs.getInt(4);
                String mNev=rs.getString(5);
                String mVaros=rs.getString(6);
                EloadasModel ea = new EloadasModel(fCim,fEv,datum, bevetel, mNev, mVaros);
                li.add(ea);
            }
            return li;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public ArrayList<Integer> moziid(){
        try{
            ArrayList<Integer> li = new ArrayList<>();
            Statement st = conn.createStatement();

            String sql="SELECT id FROM mozi";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                int aktId = rs. getInt(1);
                li.add(aktId);
            }
            return li;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public int torol(int ID){
        try{
            Statement st = conn.createStatement();
            String sql="DELETE FROM mozi WHERE id="+ID;
            return st.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return -111;
        }
    }

    public boolean letezikMozi(int ID) throws SQLException{
        try{
            Statement st = conn.createStatement();
            String sql="SELECT COUNT(id) FROM mozi WHERE id="+ID;
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            if(rs.getInt(1)>0)
                return true;
            return false;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public boolean hozzaadMozi(MoziEntity uj) throws SQLException {
        try{
            Statement st = conn.createStatement();
            String sql="INSERT INTO mozi (`id`, `nev`, `varos`, `ferohely`)";
            sql+=" VALUES ("+uj.id+", '"+uj.nev+"', '"+uj.varos+"', '"+uj.ferohely+"')";
            st.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public boolean modositMozi(int ID, String nev, String varos, int ferohely) throws SQLException {
        try{
            Statement st = conn.createStatement();
            String sql=String.format("UPDATE mozi SET nev='%s', varos='%s', ferohely='%d' WHERE id=%d",nev, varos, ferohely, ID);
            st.executeUpdate(sql);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }

    public ArrayList<EloadasModel> getAllData(){
        try{
            ArrayList<EloadasModel> li = new ArrayList<>();
            Statement st = conn.createStatement();

            String sql="SELECT cim, ev, datum, bevetel, nev, varos FROM (film INNER JOIN eloadas ON film.id=filmid) INNER JOIN mozi ON mozi.id=moziid";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String fCim=rs.getString(1);
                int fEv = rs. getInt(2);
                String datum = rs.getString(3);
                int bevetel= rs.getInt(4);
                String mNev=rs.getString(5);
                String mVaros=rs.getString(6);
                EloadasModel ea = new EloadasModel(fCim,fEv,datum, bevetel, mNev, mVaros);
                li.add(ea);
            }
            return li;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public MoziEntity getMoziById(int ID){
        try{
            Statement st = conn.createStatement();
            String sql="SELECT * FROM mozi WHERE id="+ID;
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            String nev = rs.getString("nev");
            String varos = rs.getString("varos");
            int ferohely=rs.getInt("ferohely");
            return new MoziEntity(ID, nev, varos, ferohely);
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
