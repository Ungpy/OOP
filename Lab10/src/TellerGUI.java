import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1,p2,p3;
    private JLabel l1,l2;
    private JTextField tf1,tf2;
    private JButton bt1,bt2,bt3;
    public TellerGUI(){
        fr = new JFrame("TellerGUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new GridLayout(4,1));
        p1 = new JPanel();
        p1.setLayout(new GridLayout(1,2));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,2));
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf1 = new JTextField();
        tf1.setEditable(false);
        tf2 = new JTextField();
        p1.add(l1); 
        p1.add(tf1);
        p2.add(l2); 
        p2.add(tf2);
        p3 = new JPanel();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        p3.add(bt1); 
        p3.add(bt2); 
        p3.add(bt3);
        
        fr.add(p1); 
        fr.add(p2); 
        fr.add(p3);
        //fr.setSize(200,150);
        fr.pack();
        fr.setVisible(true);
    }
}
