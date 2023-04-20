import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorOneGUI implements ActionListener{
    private JFrame fr;
    private JPanel p1;
    private JTextField tf1, tf2, tf3;
    private JButton bt1, bt2, bt3, bt4;
    
    public CalculatorOneGUI(){
        fr = new JFrame("craung_kid_lek");
        p1 = new JPanel();
        bt1 = new JButton("Plus");
        bt2 = new JButton("Minus");
        bt3 = new JButton("Multiply");
        bt4 = new JButton("Divine");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(tf1); fr.add(tf2); fr.add(p1); fr.add(tf3);
        p1.add(bt1); p1.add(bt2); p1.add(bt3); p1.add(bt4);
        p1.setLayout(new FlowLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
        //fr.setSize(400, 200);
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(bt1)){
            tf3.setText(Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText())+ "");
        }else if(ae.getSource().equals(bt2)){
            tf3.setText(Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText())+ "");
        }else if(ae.getSource().equals(bt3)){
            tf3.setText(Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText())+ "");
        }else if(ae.getSource().equals(bt4)){
            tf3.setText(Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText())+ "");
        }
    }
}
