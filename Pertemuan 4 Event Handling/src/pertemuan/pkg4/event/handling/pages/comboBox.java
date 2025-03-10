package pertemuan.pkg4.event.handling.pages;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class comboBox extends JFrame implements ItemListener{
    private String status[] = {"Setuju", "Batal"};
    private JLabel lbl;
    private JComboBox cbStatus;
    
    public comboBox(){
        setTitle("Combo Box Handling");
        lbl = new JLabel("Status: blm dipilih");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        
        cbStatus = new JComboBox(status);
        cbStatus.addItemListener(this);
        
        setLayout(new BorderLayout());
        add(lbl, "North");
        add(cbStatus, "South");
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == cbStatus){
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(cbStatus.getSelectedIndex() == 0){//yg di array
                    lbl.setText("Status: setuju");
                }else if(cbStatus.getSelectedIndex() == 1){
                    lbl.setText("Status: batal");
                }
            }
        }
    }
    
}
