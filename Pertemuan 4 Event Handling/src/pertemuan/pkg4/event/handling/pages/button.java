package pertemuan.pkg4.event.handling.pages;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class button extends JFrame implements ActionListener{
    private JLabel lbl;
    private JButton btnSetuju,btnBatal,btnNext;
    
    public button(){
        super("Halamana Buttonn Handling");
        
        lbl = new JLabel("Status: belum ditekan");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        btnSetuju = new JButton("Setuju");
        btnBatal = new JButton("Batal");
        btnNext = new JButton("Next");
        
        btnSetuju.addActionListener(this);
        btnBatal.addActionListener(this);
        btnNext.addActionListener(this);
        
//        btnSetuju.addActionListener((e) -> {
//            lbl.setText("Status: setuju");
//        });
//        
//        btnBatal.addActionListener((e) -> {
//            lbl.setText("Status: batal");
//        });
        
        setLayout(new BorderLayout());
        add(lbl, "North");
        add(btnSetuju, "West");
        add(btnBatal, "East");
        add(btnNext, "Center");
        
        pack();
        setResizable(true);
        setLocation(100, 100);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSetuju) {//klo dipencetnya button setuju
            lbl.setText("Status: setuju");
        }else if(e.getSource() == btnBatal){
            lbl.setText("Status: batal");
        }else{
            new radiobutton();
        }
    }
}
