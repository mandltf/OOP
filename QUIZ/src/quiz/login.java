/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author manda
 */
public class login extends JFrame implements ActionListener{
    public JLabel welcome;
    public JTextField fuser, fpass;
    public JButton login;
    public login(){
        setTitle("Halaman Login");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,180);
        setLocationRelativeTo(this);
        setLayout(new BorderLayout());
        
        fuser = new JTextField(10);
        fpass = new JTextField(10);
        welcome = new JLabel("Selamat Datang di Aplikasi, 123230138!");
        
        add(welcome,"North");
        JPanel input = new JPanel(new GridLayout(2,2));
        input.add(new JLabel("Username"));
        input.add(fuser);
        input.add(new JLabel("Password"));
        input.add(fpass);
        add(input,"Center");
        
        login = new JButton("Login");
        login.addActionListener(this);
        add(login,"South");
        
        setVisible(true);
;    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            if(!fuser.getText().isEmpty()&&fpass.getText().equals("pbo-d")){
                new input(fuser.getText());
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Gagal Login, Patikan Username Terisi & Password Sesuai", "Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
