/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.helper;

import java.sql.*;
import java.util.*;
import mvc.models.Biodata;

/**
 *
 * @author manda
 */
public class DBHelper {
    private final String dhUrl = "jdbc:mysql://localhost/mahasiswa";
    private final String user = "root";
    private final String pass = "";
    
    private Connection conn;
    private Statement stmt;
    private ResultSet rs; //menampung hasil query
    private String query;
    
    public DBHelper(){
        try{
            conn = DriverManager.getConnection(dhUrl, user, pass);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    //fungsi utk read data
    public List<Biodata> getAllData(){
        List<Biodata> data = new ArrayList<>();
        query = "Select * from biodata";
        try{
            stmt = conn.createStatement(); //menjalankan query
            rs = stmt.executeQuery(query); //menampung hasil query
            while(rs.next()){ //selama data masih ada maka diulang trs
                Biodata orang = new Biodata();
                orang.setNim(rs.getString("nim"));
                orang.setNama(rs.getString("nama"));
                orang.setUmur(rs.getInt("umur"));
                data.add(orang);
            }
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return data;
    }
    
    //fungsi untuk write data
    public boolean addNewBiodata(String nim, String nama, int umur){
        boolean value = false;
        query = "INSERT INTO Biodata SET nim = '" + nim
                + "', nama = '" + nama + "', umur = '" + umur + "'";
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return value;
    }
    
    //fungsi untuk delete data
    public boolean removeBiodata(String nim){
        boolean value = false;
        query = "DELETE FROM Biodata WHERE nim = '" + nim
                + "'";
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return value;
    }
    
    //fungsi untuk update data
    public boolean updateBiodata(String nim,String nimbaru, String nama, int umur){
        boolean value = false;
        query = "UPDATE Biodata SET nama = '" + nama + "', umur = " + umur + ", NIM = '"+ nimbaru+"' WHERE nim = '" 
                + nim + "'";
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return value;
    }
}
