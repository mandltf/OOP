package Main;

import javax.swing.*;

public class Pertemuan3Swing {
    public static void main(String[] args) {
        GUI g = new GUI();
//        JFrame frame = new JFrame();
//        
//        //utknama framenya
//        frame.setTitle("manda/123230138");
//        
//        //ukuran frame
//        frame.setSize(400,600);
//        
//        //biar ketok, muncul
//        frame.setVisible(true);
//        
//        //utk mengakhiri runningtime
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        //biar si frmaenya muncul posisi di tengah
//        frame.setLocationRelativeTo(null);
    }  
}

class GUI extends JFrame {
    final JTextField fnama =  new JTextField(10);
    
    JLabel lnama = new JLabel("Nama Lengkap");
    JLabel lgender = new JLabel("Gender");
    JRadioButton rbPria = new JRadioButton("Laki-laki");
    JRadioButton rbWanita = new JRadioButton("Permpuan");
    
    JLabel lagama = new JLabel("Agama");
    String[] namaAgama = {"Islam", "kristen","hindu","budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
    JLabel lhobby = new JLabel("Hobby");
    JCheckBox cbTuru = new JCheckBox("Turu");
    JCheckBox cbMangan = new JCheckBox("Mangan");
    
    JButton btnSave = new JButton("SUBMIT");
    
    public GUI(){
        setTitle("SWING");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(350,200);
        
        //bikin program biar radio buttonnya kepilih satu aja
        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);
        
        //biar ukurannya bisa kita atur sendiri
        setLayout(null);
        add(lnama);
        add(fnama);
        add(lgender);
        add(rbPria);
        add(rbWanita);
        add(lagama);
        add(cmbAgama);
        add(lhobby);
        add(cbTuru);
        add(cbMangan);
        add(btnSave);
        
        //m = posisi x, n = posisi y
        //o = panjang komponen, p = tinggi komponen
        lnama.setBounds(10,10,120,20);
	fnama.setBounds(130,10,150,20);
	lgender.setBounds(10,35,120,20);
	rbPria.setBounds(130,35,100,20);
	rbWanita.setBounds(230,35,100,20);
	lagama.setBounds(10,60,150,20);
	cmbAgama.setBounds(130,60,150,20);
	lhobby.setBounds(10,85,120,20);
	cbTuru.setBounds(130,85,100,20);
	cbMangan.setBounds(230,85,150,20);
	btnSave.setBounds(100,130,120,20);

        setVisible(true);
    }
}
