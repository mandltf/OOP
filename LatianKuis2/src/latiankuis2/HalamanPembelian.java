/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latiankuis2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author manda
 */
public class HalamanPembelian extends JFrame implements ActionListener{
    public JLabel qapel, qjeruk, qmangga, subtotal, pajakk, jmlh;
    public JButton kembali;
    public HalamanPembelian(int apel, int jeruk, int mangga){
        setTitle("Halaman Pembelian");
        setSize(350,360);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(this);
        setLayout(null);
        
        int japel = apel*15000;
        int jjeruk = jeruk*12000;
        int jmangga = mangga*20000;
        int total = japel+jjeruk+jmangga;
        int pajak = total*10/100;
        int jumlah = total+pajak;

        qapel = new JLabel("Apel: "+apel+" kg x Rp15.000 = Rp"+japel);
        qjeruk = new JLabel("Apel: "+apel+" kg x Rp15.000 = Rp"+jjeruk);
        qmangga = new JLabel("Apel: "+apel+" kg x Rp15.000 = Rp"+jmangga);
        
        kembali = new JButton("Kembali");
        kembali.addActionListener(this);
        kembali.setBounds(50,240,230,30);
        
        JPanel ket = new JPanel(new GridLayout(3,1,0,10));
        ket.add(qapel);
        ket.add(qjeruk);
        ket.add(qmangga);
        ket.setBounds(50,40,240,70);
        
        JPanel ket2 = new JPanel(new GridLayout(3,1,0,10));
        subtotal = new JLabel("Subtotal: Rp"+total);
        pajakk = new JLabel("Pajak (10%): Rp"+pajak);
        jmlh = new JLabel("Total Harga : Rp"+jumlah);
        ket2.add(subtotal);
        ket2.add(pajakk);
        ket2.add(jmlh);
        ket2.setBounds(50,150,230,70);
        
        add(ket);
        add(ket2);
        add(kembali);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==kembali){
                new HalamanUtama("amanda latifa");
                this.dispose();
            }
        } catch (Exception i) {
            JOptionPane.showMessageDialog(null, "Kembali atau keluar", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
        };
        
    }
}
