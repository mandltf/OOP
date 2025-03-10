package Main;

import Perusahaan.karyawan;
import Perusahaan.HRD;
public class Pertemuan2PBO {
    public static void main(String[] args) {
        karyawan manda = new karyawan("manda", "jakal","joko");
//        manda.namaHRD = "Joko";
        System.out.print("Nama karyawan awal: ");
        System.out.println(manda.getNama());
        manda.setNama("latifa");
        System.out.print("Nama karyawan baru: ");
        System.out.println(manda.getNama());
        System.out.print("Nama HRD: ");
        System.out.println(manda.getNamaHRD());
        
        manda.sapaKaryawan();
        manda.sapaKaryawan("manda");
        
        manda.naikGaji();
        HRD joko = new HRD("joko", "jakarta");
        joko.naikGaji();
        
        
        //interface dan akstrak gabisa lgsg dibikin objek harus diimplementasiin dulu di child class
        //MakhlukHidup a = new MakhlukHidup();
        
        String pekerjaan = manda.getNamaPekerjaan();
        System.out.println(pekerjaan);
    }
    
}
