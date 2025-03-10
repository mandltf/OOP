package Main;

import MakhlukHidup.Manusia;
import MakhlukHidup.Hewan.Burung;

public class Main {

    public static void main(String[] args) {
        Manusia human = new Manusia("Ucup");
        System.out.println("Manusia bernama "+human.nama+ " itu jahat");
        human.Bernafas();
    
        Burung bird = new Burung("Ucup");
        bird.SimpanNama("Manda");
        System.out.println("Dengan burung liciknya bernama "+bird.nama);
    }
    
}
