/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import helper.helper;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.model;
import views.formulir;

/**
 *
 * @author manda
 */
public class controller {
    formulir f;
    private final DefaultTableModel model;
    public controller(){
        String []header={"ID", "NAMA PRODUK","BIAYA TENAGA KERJA", "EFISIENSI PRODUKSI","TOTAL BIAYA PRODUKSI","UNIT","JAM","TENAGA","BIAYA"};
        model = new DefaultTableModel(header,0);
        refreshTable();
        f = new formulir(this);
        f.getTable().setModel(model);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        hideColumn(f.getTable(),0);
        hideColumn(f.getTable(),5);
        hideColumn(f.getTable(),6);
        hideColumn(f.getTable(),7);
        hideColumn(f.getTable(),8);
    }
    
    private void hideColumn(JTable tabel, int index){
        TableColumn kol = tabel.getColumnModel().getColumn(index);
        kol.setMinWidth(0);
        kol.setMaxWidth(0);
        kol.setPreferredWidth(0);
        kol.setWidth(0);
        kol.setResizable(false);
    }
    
    private void refreshTable(){
        model.setRowCount(0);
        helper help = new helper();
        List<model> data = help.getAllData();
        data.forEach((m->{model.addRow(new Object[] {m.getId(), m.getNama() ,m.getBiayatenaga(), m.getEfisiensi(), m.getTotal(), m.getUnit(),m.getJam(), m.getTenaga() ,m.getBiaya()});}));
    }
    
    public void hapusData(int ID){
        helper help = new helper();
        if(help.removeData(ID)){
            refreshTable();
        }else{
            System.out.println("gagal menghapus");
        }
    }
    public void editData(String nama, int biaya_tenaga, int efisiensi, int total, int id, int unit, int jam, int tenaga, int biaya){
        helper help = new helper();
        if(help.updateData(nama, biaya_tenaga, efisiensi, total, id,unit, jam, tenaga, biaya)){
            refreshTable();
        }else{
            System.out.println("gagal menghapus");
        }
    }
    public void tambahData(String nama, int biaya_tenaga, int efisiensi, int total,int unit, int jam, int tenaga, int biaya){
        helper help = new helper();
        if(help.addData(nama, biaya_tenaga, efisiensi, total, unit, jam, tenaga, biaya)){
            refreshTable();
        }else{
            System.out.println("gagal menghapus");
        }
    }
    
}
