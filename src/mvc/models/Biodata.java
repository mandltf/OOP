/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc.models;

/**
 *
 * @author manda
 */
public class Biodata {
    String nama, nim;
    int Umur;
    
    //alt+insert

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getUmur() {
        return Umur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
    
}
