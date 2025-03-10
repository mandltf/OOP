package pertemuan.pkg2.exception;

import java.util.Scanner;

public class Pertemuan2Exception {
    public static void main(String[] args) {
        int nilai = 0;
        
        Scanner scn = new Scanner (System.in);
        
        System.out.print("Masukkan inputan: ");
        String input = scn.next(); //.next ini bisa membaca satu kata, nextLine() utk baca semua baris
        
        
        try{
            if(input.equals("Java")){
                throw new RuntimeException();
            }else{
                System.out.println(input+" tidak dilempar");
            }
            System.out.println("maka tulisan ini akan muncul");
        }catch(RuntimeException e){
            System.out.println(input+" ditangkap disini");
        }
//        try{//yg membuat program jadi eror dimasukin sini alias disini adalah inputannya
//            System.out.println("Masukkan nilai: ");
//            nilai = scn.nextInt(); //.nextInt hanya membaca 1 kata di depan
//        }catch(Exception e){//utk menangani eror, utk kesalahan yg bisa diprediksi pakai exception
//            System.out.println("erornya adalah "+e.getMessage());
//        }finally{
//            System.out.println("nilainya adalah "+nilai);
//        }

//        try berisi kode yang bisa menyebabkan error (misalnya nextInt()).
//✅      catch menangani error jika terjadi input yang salah.
//✅      finally akan selalu dijalankan, baik ada error atau tidak.
//        
    }
    
}
