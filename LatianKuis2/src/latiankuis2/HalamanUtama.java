/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latiankuis2;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manda
 */
public class HalamanUtama extends JFrame implements ActionListener{
    public JLabel welcome;
    public JTextField fapel, fjeruk, fmangga;
    public JButton beli,logout;
    public int aapel, ajeruk, amangga;
    public HalamanUtama(String nama){
        setTitle("Halaman Utama");
        setSize(370,350);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(this);
        setLayout(null);
        
        fapel = new JTextField(10);
        fjeruk = new JTextField(10);
        fmangga = new JTextField(10);
        beli = new JButton("Beli");
        logout = new JButton("Logout");
        
        fapel.setText("0");
        fjeruk.setText("0");
        fmangga.setText("0");
        
        beli.addActionListener(this);
        logout.addActionListener(this);
        
        welcome = new JLabel("Selamat Datang, "+nama);
        welcome.setFont(new Font("Arial", Font.BOLD,13));
        welcome.setBounds(40,20,200,40);
        JPanel kiri = new JPanel(new GridLayout(3,1,0,10));
        kiri.add(new JLabel("Apel (Rp15.000/kg) : "));
        kiri.add(new JLabel("Jeruk (Rp12.000/kg) : "));
        kiri.add(new JLabel("Mangga (Rp20.000/kg) : "));
        kiri.setBounds(40, 60, 150, 100);
        
        JPanel kanan = new JPanel(new GridLayout(3,1,0,10));
        kanan.add(fapel);
        kanan.add(fjeruk);
        kanan.add(fmangga);
        kanan.setBounds(200, 60, 120, 100);
        
        JPanel tombol = new JPanel(new GridLayout(2,1,0,10));
        tombol.add(beli);
        tombol.add(logout);
        tombol.setBounds(40, 190, 280, 70);
        
        add(welcome);
        add(kiri);
        add(kanan);
        add(tombol);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aapel = Integer.parseInt(fapel.getText());
        ajeruk = Integer.parseInt(fjeruk.getText());
        amangga = Integer.parseInt(fmangga.getText());
        if(e.getSource()==beli){
            new HalamanPembelian(aapel,ajeruk,amangga);
            this.dispose();
        }else if(e.getSource()==logout){
            this.dispose();
        }
    }
}
