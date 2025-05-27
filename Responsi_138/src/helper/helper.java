/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import java.sql.*;
import java.util.*;
import model.model;


/**
 *
 * @author manda
 */
public class helper {
    private final String dbUrl = "jdbc:mysql://localhost/kerja";
    private final String user ="root";
    private final String pass="";
    
    private Connection conn;
    public Statement stmt;
    private ResultSet rs;
    private String query;
    public helper(){
        try{
            conn = DriverManager.getConnection(dbUrl, user, pass);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public List<model> getAllData(){
    List<model> data = new ArrayList<>();
    query = "SELECT * FROM data_kerja";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            while(rs.next()){
                model mod = new model();
                mod.setNama(rs.getString("NAMA"));
                mod.setBiayatenaga(rs.getInt("BIAYA_TENAGA_KERJA"));
                mod.setId(rs.getInt("ID"));
                mod.setEfisiensi(rs.getInt("EFISIENSI"));
                mod.setTotal(rs.getInt("TOTAL"));
                mod.setUnit(rs.getInt("UNIT"));
                mod.setJam(rs.getInt("JAM_KERJA"));
                mod.setTenaga(rs.getInt("TENAGA_KERJA"));
                mod.setBiaya(rs.getInt("BIAYA"));
                data.add(mod);
            }
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }return data;
    }
    
    public boolean addData(String nama, int biaya_tenaga, int efisiensi, int total,int unit, int jam, int tenaga, int biaya){
        boolean value = false;
        query = "INSERT INTO data_kerja set NAMA='"+nama+"', BIAYA_TENAGA_KERJA="+biaya_tenaga+", EFISIENSI="+efisiensi+", TOTAL="+total+", UNIT = "+unit+", JAM_KERJA="+jam+
                ", TENAGA_KERJA= "+tenaga+", BIAYA="+biaya+"";
        
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }return value;
    }
    
    public boolean removeData(int id){
        boolean value = false;
        query = "DELETE FROM data_kerja where ID="+id+"";
        
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }return value;
    }
    
    public boolean updateData(String nama, int biaya_tenaga, int efisiensi, int total, int id,int unit, int jam, int tenaga, int biaya){
        boolean value = false;
        query = "UPDATE data_kerja set NAMA='"+nama+"', BIAYA_TENAGA_KERJA="+biaya_tenaga+", EFISIENSI="+efisiensi+", TOTAL="+total+", UNIT = "+unit+", JAM_KERJA="+jam+
                ", TENAGA_KERJA= "+tenaga+", BIAYA="+biaya+" where ID="+id+"";
        
        try{
            stmt = conn.createStatement();
            if(stmt.executeUpdate(query)>0){
                value = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }return value;
    }
}

