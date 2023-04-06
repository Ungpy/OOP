import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel l_Button;
    private JTextField tf1, tf2, tf3;
    private JButton bt1, bt2, bt3, bt4;
    public CalculatorOneGUI(){
        fr = new JFrame("craung_kid_lek");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l_Button = new JPanel();
        l_Button.setLayout(new FlowLayout());
        l_Button.add(bt1 = new JButton("Plus"));
        l_Button.add(bt2 = new JButton("Minus"));
        l_Button.add(bt3 = new JButton("Multiply"));
        l_Button.add(bt4 = new JButton("Divine"));
//        bt1 = new JButton("Plus");
//        bt2 = new JButton("Minus");
//        bt3 = new JButton("Multiply");
//        bt4 = new JButton("Divine");
        fr.setLayout(new GridLayout(4,1));
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        fr.add(tf1);
        fr.add(tf2);
        fr.add(l_Button);
        fr.add(tf3);
        fr.setSize(400, 200);
        fr.setVisible(true);
    }
}
