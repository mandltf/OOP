package Perusahaan;

public class karyawan extends HRD implements Pekerjaan{ //turunan interface adalah implements sedangkan extends bisa buat class dan abstrak
    private String nama;
    public String alamatKaryawan;

    public karyawan(String nama, String alamatKaryawan, String namaHRD) {
        super("latifa", "jakal");
        this.nama = nama; //this berfungsi untuk mengacu si namaKaryawan yang sebagai atribut, bukan yg ada di parameter
        //this itu mereferensikan ke class saat ini sedangkan super mereferensikan ke parent class
        super.nama = namaHRD;
        this.alamatKaryawan = alamatKaryawan;
    }
    
    //overloading, fungsinya sama tapi beda yg satu ada params yg satu lagi ga
    public void sapaKaryawan(){
        System.out.println("selamat bekerja");
    }
    
    public void sapaKaryawan(String nama){
        System.out.println("halo, "+nama+", selamat bekerja");
    }

    @Override //ini anotasi,override dgn naikGaji() diclass karyawan
    public void naikGaji() {
        System.out.println("karyawan naik gaji");
    }
    
    
    
    public String getNamaHRD(){
        return super.nama;
    }
    
    //Getter setter
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    @Override
    public void tampilGaji() {
        System.out.println("alhamdulillah"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNamaPekerjaan() {
        return "mahasiswa"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
