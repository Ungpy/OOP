import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorTwoGUI implements ActionListener{
    private JFrame fr;
    private JPanel p_Button;
    private JButton zero,one,two,three,four,five,six,seven,eight,nine,del,equal,plus,minus,multiply,divine;
    private JTextField tf;
    private double num1, num2;
    private int stage;
    private boolean oparation, done;
    public CalculatorTwoGUI(){
        fr = new JFrame("CalculatorTwoGUI");
        p_Button = new JPanel();
        p_Button.setLayout(new GridLayout(4,4));
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        del = new JButton("c");
        equal = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("x");
        divine = new JButton("/");
        tf = new JTextField();
        
        p_Button.add(seven);
        p_Button.add(eight);
        p_Button.add(nine);
        p_Button.add(plus);
        p_Button.add(four);
        p_Button.add(five);
        p_Button.add(six);
        p_Button.add(minus);
        p_Button.add(one);
        p_Button.add(two);
        p_Button.add(three);
        p_Button.add(multiply);
        p_Button.add(zero);
        p_Button.add(del);
        p_Button.add(equal);
        p_Button.add(divine);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.add(tf, BorderLayout.NORTH);
        fr.add(p_Button, BorderLayout.CENTER);
        
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        del.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divine.addActionListener(this);
        
        fr.setSize(200,200);
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ev){
        if(ev.getSource().equals(zero)){
            tf.setText(tf.getText()+ 0);
        }else if(ev.getSource().equals(one)){
            tf.setText(tf.getText()+ 1);
        }else if(ev.getSource().equals(two)){
            tf.setText(tf.getText()+ 2);
        }else if(ev.getSource().equals(three)){
            tf.setText(tf.getText()+ 3);
        }else if(ev.getSource().equals(four)){
            tf.setText(tf.getText()+ 4);
        }else if(ev.getSource().equals(five)){
            tf.setText(tf.getText()+ 5);
        }else if(ev.getSource().equals(six)){
            tf.setText(tf.getText()+ 6);
        }else if(ev.getSource().equals(seven)){
            tf.setText(tf.getText()+ 7);
        }else if(ev.getSource().equals(eight)){
            tf.setText(tf.getText()+ 8);
        }else if(ev.getSource().equals(nine)){
            tf.setText(tf.getText()+ 9);
        }else if(ev.getSource().equals(del)){
            tf.setText("");
            stage = 0;
            num1 = 0;
            num2 = 0;
        }else if(ev.getSource().equals(plus)){
            stage = 1;
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
        }else if(ev.getSource().equals(minus)){
            stage = 2;
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
        }else if(ev.getSource().equals(multiply)){
            stage = 3;
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
        }else if(ev.getSource().equals(divine)){
            stage = 4;
            num2 = Double.parseDouble(tf.getText());
            tf.setText("");
        }else if(ev.getSource().equals(equal)){
            if(stage == 1){
                num2 = num2+Double.parseDouble(tf.getText());
            }else if(stage == 2){
                num2 = num2-Double.parseDouble(tf.getText());
            }else if(stage == 3){
                num2 = num2*Double.parseDouble(tf.getText());
            }else if(stage == 4){
                num2 = num2/Double.parseDouble(tf.getText());
            }
            tf.setText(num2+"");
            stage = 0;
            num2 = 0;
        }
        
    }
}
