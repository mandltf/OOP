/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author manda
 */
public class input extends JFrame implements ItemListener, ActionListener{
    public String status[]={"IT","HRD","FINANCE","MARKETING"};
    public JLabel data;
    public JComboBox combo;
    public JRadioButton pria, wanita;
    public JTextField fdepan, fblkg;
    public JTextArea ta;
    public JButton simpan, iiimport,export;
    public JCheckBox convert;
    public ButtonGroup grp;
    public String namadepan, namablkg, pekerjaan="";
    public JPanel tombol;
    JScrollPane sp;
    ArrayList<String> list;
    
    public input(String user){
        setTitle("Input Member by "+user);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300,450);
        setLocationRelativeTo(this);
        setLayout(new GridLayout(2,1));
        
        
        
        
        JPanel atas = new JPanel(new GridLayout(2,2,5,5));
        atas.add(new JLabel("Nama Depan:"));
        atas.add(new JLabel("Nama Belakang:"));
        fdepan = new JTextField(10);
        fblkg = new JTextField(10);
        atas.add(fdepan);
        atas.add(fblkg);
        
        JPanel gender = new JPanel(new FlowLayout());
        gender.add(new JLabel("Jenis Kelamin: "));
        pria = new JRadioButton("Pria");
        wanita = new JRadioButton("Wanita");
        gender.add(pria);
        gender.add(wanita);
        
        grp = new ButtonGroup();
        grp.add(pria);
        grp.add(wanita);
        
        JPanel cb = new JPanel(new GridLayout(2,1,5,5));
        cb.add(new JLabel("Divisi:"));
        combo = new JComboBox(status);
        combo.addItemListener(this);
        cb.add(combo);
        
        simpan = new JButton("Simpan");
        simpan.addActionListener(this);
        
        JPanel upper = new JPanel(new GridLayout(4,1,5,5));
        upper.add(atas);
        upper.add(cb);
        upper.add(gender);
        upper.add(simpan);
        add(upper);
        
        
        JPanel isi = new JPanel(new BorderLayout());
        data = new JLabel("List data: ");
        isi.add(data,"North");
        ta = new JTextArea();
        ta.setEditable(false);
        sp = new JScrollPane(ta);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        isi.add(ta,"Center");
        
        tombol = new JPanel(new FlowLayout());
        iiimport = new JButton("Import from Txt");
        export = new JButton("Export to txt");
        tombol.add(iiimport);
        tombol.add(export);
        iiimport.addActionListener(this);
        export.addActionListener(this);
        tombol.setVisible(false);
        
        JPanel bawah = new JPanel(new BorderLayout());
        convert = new JCheckBox("Ingin melakukan Import/Export data?");
        bawah.add(convert,"North");
        bawah.add(tombol,"Center");
        convert.addItemListener(this);
        
        isi.add(bawah,"South");
        add(isi);
        
        setVisible(true);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==combo){
            if(e.getStateChange()==ItemEvent.SELECTED){
                if(combo.getSelectedIndex()==0){
                            pekerjaan="IT";
                }else if(combo.getSelectedIndex()==1){
                            pekerjaan="HRD";
                }else if(combo.getSelectedIndex()==2){
                            pekerjaan="Finance";
                }else if(combo.getSelectedIndex()==3){
                            pekerjaan="Marketing";
                }       
            }
        }else if(e.getSource()==convert){
            if(e.getStateChange()==ItemEvent.SELECTED){
                tombol.setVisible(true);
            }else{
                tombol.setVisible(false);
            }
        }
        tombol.revalidate();
        tombol.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==simpan){
            if(fdepan.getText().equals("") || fblkg.getText().equals("") || grp.getSelection() ==null){
                JOptionPane.showMessageDialog(null, "Data belum lengkap", "Gagal",JOptionPane.INFORMATION_MESSAGE);
            }else{
                namadepan = fdepan.getText();
                namablkg = fblkg.getText();
                list = new ArrayList<>();
                if(pria.isSelected()){
                    list.add(namadepan+" "+namablkg+"| Pria |"+pekerjaan);
                }else if(wanita.isSelected()){
                    list.add(namadepan+" "+namablkg+"| Wanita |"+pekerjaan);
                }
                
                for(String data: list){
                    ta.append(data+"\n");
                }

                
            }
        }else{
            if(e.getSource()==iiimport){
                try {
                    ta.read(new FileReader("result.txt"), null);
                    ta.write(new OutputStreamWriter(new FileOutputStream("result.txt")));
                } catch (Exception b) {
                }
                
                
            }else if(e.getSource()==export){
                try {
                    FileWriter tulis = new FileWriter("result.txt");
                    tulis.write(ta.getText());
                    tulis.close();
                } catch (Exception a) {
                }
                
                
            }
        }
    }
}
