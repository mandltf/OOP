/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.controllers;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import mvc.helper.DBHelper;
import mvc.models.Biodata;
import mvc.views.DataView;

/**
 *
 * @author manda
 */
public class DataController {
    DataView v;
    
    private final DefaultTableModel modelBiodata;
    public DataController(){
        String []header = {"NIM","Nama","Umur"};
        modelBiodata = new DefaultTableModel(header, 0);
        refreshTable();
        
        v = new DataView(this); //this karna udh pake construktor DataController diatas
        v.getjTableview().setModel(modelBiodata);
        v.setVisible(true);
    }
    
    public void hapusData(String nim){
        DBHelper helper = new DBHelper();
        if(helper.removeBiodata(nim)){
            refreshTable();
        }else{
            //isi dialog eror handling
        }
    }
    public void tambahData(String nim, String nama, int umur) {
    DBHelper helper = new DBHelper();
    if(helper.addNewBiodata(nim, nama, umur)) {
        refreshTable();
    } else {
        // bisa tampilkan dialog error di sini
    }
}
public void ubahData(String nim,String nimbaru, String nama, int umur){
    DBHelper helper = new DBHelper();
    if(helper.updateBiodata(nim,nimbaru, nama, umur)){
        refreshTable(); // supaya tabel langsung update setelah diedit
    } else {
        // Tambahkan dialog error kalau perlu
        System.out.println("Gagal update data.");
    }
}


    private void refreshTable(){
        modelBiodata.setRowCount(0); //menghapus semua data pada table di view
        DBHelper helper = new DBHelper();
        List<Biodata> data = helper.getAllData();
        data.forEach((m ->{
            modelBiodata.addRow(new Object[]{m.getNim(),m.getNama(),m.getUmur()});
        }));
    }
}
