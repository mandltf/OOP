/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.*;
import java.util.*;
import models.Model;
import views.Formulir;

/**
 *
 * @author manda
 */
public class Helper {
    private final String dbUrl = "jdbc:mysql://localhost/movie_db";
    private final String user = "root";
    private final String pass = "";
    private Connection conn;
    private Statement stmt;
    private ResultSet rs;
    String query;
    
    public Helper(){
        try{
            conn = DriverManager.getConnection(dbUrl,user,pass);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    //fungsi read data
    public List<Model> getAllData(){
        List<Model> model = new ArrayList<>();
        query = "Select * from data_film";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                Model data = new Model();
                data.setId(rs.getInt("ID"));
                data.setJudul(rs.getString("JUDUL"));
                data.setAkting(rs.getDouble("AKTING"));
                data.setAlur(rs.getDouble("ALUR"));
                data.setNilai(rs.getDouble("NILAI"));
                data.setPenokohan(rs.getDouble("PENOKOHAN"));
                model.add(data);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return model;
    }
    
    //fungsi write data
    public boolean addData(String judul, double alur, double penokohan, double akting, double nilai){
        boolean value = false;
        query = "INSERT INTO data_film SET JUDUL = '"+ judul + "', ALUR = '" + alur + "', PENOKOHAN = '" + penokohan 
                + "', AKTING = '" + akting + "', NILAI = '" + nilai + "'";
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
    
    //fungsi delete data
    public boolean deleteData(int id){
        boolean value = false;
        query = "DELETE FROM data_film where ID = " + id + "";
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
    
    //fungsi update data
    public boolean updateData(String judul, double alur, double penokohan, double akting, double nilai, int id){
        boolean value = false;
        query = "UPDATE data_film SET JUDUL = '"+ judul + "', ALUR = '" + alur + "', PENOKOHAN = '" + penokohan 
                + "', AKTING = '" + akting + "', NILAI = '" + nilai + "' WHERE ID = " + id + "";
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


