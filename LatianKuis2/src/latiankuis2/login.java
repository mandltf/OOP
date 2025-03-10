/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latiankuis2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manda
 */
public class login extends JFrame implements ActionListener{
    public JTextField fuser;
    public JPasswordField fpass;
    public JButton login, reset;
    public login(){
        setTitle("Halaman Login");
        setSize(350,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(this);
        
        fuser = new JTextField(10);
        fpass = new JPasswordField(10);
        login = new JButton("Login");
        reset = new JButton("Reset");
        login.addActionListener(this);
        reset.addActionListener(this);
        
        JPanel label = new JPanel(new GridLayout(2,1,0,10));
        label.add(new JLabel("Username"));
        label.add(new JLabel("Password"));
        label.setBounds(50, 30, 80, 80);
        
        JPanel label2 = new JPanel(new GridLayout(2,1,0,20));
        label2.add(fuser);
        label2.add(fpass);
        label2.setBounds(150, 35, 150, 70);
        
        JPanel tombol = new JPanel(new GridLayout(2,1,0,10));
        tombol.add(login);
        tombol.add(reset);
        tombol.setBounds(50, 140, 250, 60);
        
        add(label);
        add(label2);
        add(tombol);
        
        setVisible(true);
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(e.getSource()==login){
                if(fuser.getText().equals("amanda latifa") && new String(fpass.getPassword()).equals("123230138")){
                    new HalamanUtama(fuser.getText());
                    this.dispose();
                }else{
                    throw new RuntimeException();
                }
            }else if(e.getSource()==reset){
                fpass.setText("");
                fuser.setText("");
            }
        } catch (RuntimeException i) {
            JOptionPane.showMessageDialog(null, "Lengkapi data dengan benar", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
            fuser.setText("");
            fpass.setText("");
        }
        
    }
}
