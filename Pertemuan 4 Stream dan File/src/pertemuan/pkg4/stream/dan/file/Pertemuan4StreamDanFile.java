package pertemuan.pkg4.stream.dan.file;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StreamFile extends JFrame{
    JTextArea ta;
    JButton btnSave;
    ActionListener aksi;
    
    public StreamFile(){
        setTitle("Stream File");
        setSize(340,280);
        
        JPanel panel = new JPanel();
        add(panel, "North");
        
        btnSave = new JButton("Save");
        btnSave.addActionListener( new aksi());
        panel.add(btnSave);
        
        JPanel p = new JPanel();
        add(p, "Center");
        
        ScrollPane sp = new ScrollPane();
        sp.setPreferredSize(new Dimension(300,200));
        p.add(sp);
        
        ta = new JTextArea();
        sp.add(ta);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        bacaFile();
    }
    
    class aksi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                ta.write(new FileWriter("hasilInput.txt"));
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "kata-kata hari ini", JOptionPane.INFORMATION_MESSAGE);
            }catch(IOException a){};
        }
    }
    
    public void bacaFile(){
        try{
            ta.read(new FileReader("hasilInput.txt"),null);
            ta.write(new OutputStreamWriter(new FileOutputStream("hasilinput.txt")));
        }catch(IOException a){};
    }
}

public class Pertemuan4StreamDanFile {
    public static void main(String[] args) {
        new StreamFile();
    }
    
}
