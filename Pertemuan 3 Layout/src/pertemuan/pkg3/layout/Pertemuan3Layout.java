package pertemuan.pkg3.layout;
import java.awt.FlowLayout;
import javax.swing.*;

//FLayout
class FLayout extends JFrame{
    JButton tombolOpen, tombolSave, tombolReset, tombolDelete, tombolEdit;
    public FLayout(){
        setTitle("FLayout");
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        tombolOpen = new JButton("Open");
        tombolSave = new JButton("Save");
        tombolReset = new JButton("Reset");
        tombolDelete = new JButton("Delete");
        tombolEdit = new JButton("Edit");
        
        add(tombolOpen);
        add(tombolSave);
        add(tombolReset);
        add(tombolDelete);
        add(tombolEdit);
        
        setLayout(new FlowLayout());
        //setLayout(new GridLayout(3,2)); ntar munculnya numpuk
        //setLayout(new BorderLayout()); tapi ntar di add tambahin arah mata anginnya
        //add(tombolOpen, "West");
        
    }
    
}
public class Pertemuan3Layout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FLayout f = new FLayout();
    }
    
}
