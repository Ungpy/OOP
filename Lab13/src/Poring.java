import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.*;
import java.net.URL;
public class Poring extends Thread implements MouseListener{
    static int Poring_count; 
    JFrame fr;
    JPanel p;
    JLabel l1,l2;
    Image img;
    
    public Poring(){
        fr = new JFrame();
        p = new JPanel();
        l1 = new JLabel();
        l2 = new JLabel();
//        try{
//            imageURL = Poring.class.getResource("Poring.webp");
//        }catch(IOException IOe){
//            System.out.println(IOe);
//        }
        fr.add(p);
        p.add(l1); p.add(l2);
        l1.setIcon(new javax.swing.ImageIcon("Poring.jpg"));
        l2.setText(Poring_count+"");
        Poring_count += 1;
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setResizable(false);
        l1.addMouseListener(this);
        
        fr.pack();
        fr.setVisible(true);
        
    }
    public void mouseClicked(MouseEvent me){
        if(me.getSource().equals(l1)){
            fr.setVisible(false);
        }
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
}
