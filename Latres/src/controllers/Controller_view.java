/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import helper.Helper;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Model;
import views.Formulir;

/**
 *
 * @author manda
 */
public class Controller_view {
    Formulir form;
    private final DefaultTableModel bikintabel;
    public Controller_view(){
        String []header = {"ID","Judul","Alur","Penokohan","Akting", "Nilai"};
        bikintabel = new DefaultTableModel(header,0);
        refreshTable();
        
        form = new Formulir(this);
        form.getTabel_data().setModel(bikintabel);
        hideColumn(form.getTabel_data(), 0);
        form.setVisible(true);
    }
    
    private void hideColumn(JTable table, int colIndex) {
        TableColumn column = table.getColumnModel().getColumn(colIndex);
        column.setMinWidth(0);
        column.setMaxWidth(0);
        column.setPreferredWidth(0);
        column.setWidth(0);
        column.setResizable(false);
    }
    
    private void refreshTable(){
        bikintabel.setRowCount(0);
        Helper help = new Helper();
        List<Model> data = help.getAllData();
        data.forEach((m->{bikintabel.addRow(new Object[] {m.getId(),m.getJudul(),m.getAlur(),m.getPenokohan(),m.getAkting(),m.getNilai()});}));
    }
    
    public void hapusData(int id){
    Helper help = new Helper();
        if(help.deleteData(id)){
            refreshTable();
        }else{
            System.out.println("gagal hapus");
        }
    }
    
    public void tambahData(String judul, double alur, double penokohan, double akting, double nilai){
    Helper help = new Helper();
        if(help.addData(judul, alur, penokohan, akting, nilai)){
            JOptionPane.showMessageDialog(null, "Data Movie Berhasil Ditambahkan");
            refreshTable();
        }else{
            System.out.println("gagal nambah");
        }
    }
    public void ubahData(String judul, double alur, double penokohan, double akting, double nilai, int id){
    Helper help = new Helper();
        if(help.updateData(judul, alur, penokohan, akting, nilai, id)){
            refreshTable();
        }else{
            System.out.println("gagal ubah");
        }
    }
}


