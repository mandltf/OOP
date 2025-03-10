/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakhlukHidup.Hewan;

public class Burung {
    //variable
    public static final boolean bisaTerbang = true;
    public String nama = "";
    
    public Burung(String nama){
        this.nama = nama;
        System.out.println("Nama burung: "+nama);
    }
    
    //method
    public void SimpanNama(String nama){
        this.nama = nama;
    }
    
    public String bacaNama(){
        return nama;
    }
}
