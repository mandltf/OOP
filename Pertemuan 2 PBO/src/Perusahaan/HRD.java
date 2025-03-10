package Perusahaan;

public class HRD {
    public String nama;
    public String tempatTinggal;

    public HRD(String namaHRD, String tempat) {
        System.out.println("Class KRD dibuat");
//        this.namaHRD = namaHRD;
//        this.tempatTinggal = tempatTinggal;
    }
    
    //override dgn naikGaji() diclass karyawan
    public void naikGaji(){
        System.out.println("HRD naik gaji");
    } 
}
