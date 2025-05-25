/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author manda
 */
public class Model {
    String judul;
    int id;
    Double alur, penokohan, akting, nilai;

    public Double getAkting() {
        return akting;
    }

    public Double getAlur() {
        return alur;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public Double getPenokohan() {
        return penokohan;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }

    public void setAkting(Double akting) {
        this.akting = akting;
    }

    public void setAlur(Double alur) {
        this.alur = alur;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenokohan(Double penokohan) {
        this.penokohan = penokohan;
    }
    
}
    
