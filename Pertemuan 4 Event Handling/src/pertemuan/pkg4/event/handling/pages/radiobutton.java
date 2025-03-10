package pertemuan.pkg4.event.handling.pages;

import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class radiobutton extends JFrame {
    private JTextField textField;
    private JPanel panel;
    private JRadioButton rbtn1, rbtn2, rbtn3;
    
    public radiobutton(){
        setTitle("Coba Radio Button Handling");
        textField = new JTextField("Gender: blom dipilih");
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel = new JPanel(new FlowLayout());
        rbtn1 = new JRadioButton("Pria");
        rbtn2 = new JRadioButton("Wanita");
        rbtn3 = new JRadioButton("Non-binary");
        
        //biar yg dipilih cuma satu
        ButtonGroup grup = new ButtonGroup();
        grup.add(rbtn1);
        grup.add(rbtn2);
        grup.add(rbtn3);
        
        rbtn1.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Gender: Pria");
            }
        });
        
        rbtn2.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Gender: Wanita");
            }
        });
        
        rbtn3.addItemListener((e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                textField.setText("Gender: Non-Binary");
            }
        });
        
        setLayout(new BorderLayout());
        add(textField, "North");
        add(panel, "West");
        panel.add(rbtn1);
        panel.add(rbtn2);
        panel.add(rbtn3);
        
        pack();
        setVisible(true);
        setLocation(200,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//biar klo nge close yg lain gaikut ke close alias cm dia aja yg diclose
    }
}
