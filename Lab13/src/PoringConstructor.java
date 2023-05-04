import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PoringConstructor implements ActionListener{
    JFrame fr;
    JPanel p;
    JButton bt;
    
    public PoringConstructor(){
        fr = new JFrame();
        p = new JPanel();
        bt = new JButton("Add");
        
        fr.add(p);
        p.add(bt);
        bt.addActionListener(this);
        
        fr.pack();
        fr.setVisible(true);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(bt)){
            new Poring();
        }
    }
}
