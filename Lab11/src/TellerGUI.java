import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1,p2,p3;
    private JLabel l1,l2;
    private JTextField tf1,tf2;
    private JButton bt1,bt2,bt3;
    private Account acct;
    public TellerGUI(){
        acct = new Account(6000, "E");
        fr = new JFrame("TellerGUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        tf1 = new JTextField();
        tf2 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        bt3 = new JButton("Exit");
        
        p1.add(l1); 
        p1.add(tf1);
        p2.add(l2); 
        p2.add(tf2);
        p3.add(bt1); 
        p3.add(bt2); 
        p3.add(bt3);
        fr.add(p1); 
        fr.add(p2); 
        fr.add(p3);
        fr.setLayout(new GridLayout(4,1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        tf1.setEditable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        //fr.setSize(200,150);
        fr.pack();
        fr.setVisible(true);
        
        tf1.setText(acct.getBalance()+"");
    }
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(bt1)){
            tf1.setText(acct.getBalance() + Double.parseDouble(tf2.getText())+"");
            acct.setBalance(Double.parseDouble(tf1.getText()));
        }else if(ev.getSource().equals(bt2) && acct.getBalance() >= Double.parseDouble(tf2.getText())){
            tf1.setText(acct.getBalance() - Double.parseDouble(tf2.getText())+"");
            acct.setBalance(Double.parseDouble(tf1.getText()));
        }else if(ev.getSource().equals(bt3)){
            System.exit(0);
        }
    }
}
