import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    JFrame fr;
    JPanel p1,p2;
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JButton bt1,bt2;
    Student st = null;
    
    public StudentView(){
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        l1 = new JLabel("ID :");
        l2 = new JLabel("Name :");
        l3 = new JLabel("Money :");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        bt1 = new JButton("Deposit");
        bt2 = new JButton("Withdraw");
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLayout(new BorderLayout());
        fr.add(p1,BorderLayout.CENTER);
        fr.add(p2,BorderLayout.SOUTH);
        p1.setLayout(new GridLayout(3,2));
        p1.add(l1); p1.add(tf1); 
        p1.add(l2); p1.add(tf2);
        p1.add(l3); p1.add(tf3);
        p2.setLayout(new FlowLayout());
        p2.add(bt1); p2.add(bt2);
        tf3.setEditable(false);
        
        fr.addWindowListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            st.setID(Integer.parseInt(tf1.getText()));
            st.setName(tf2.getText());
            if(st == null){
                st = new Student(tf2.getText(), Integer.parseInt(tf1.getText()), 0);
            }
            if(e.getSource().equals(bt1)){
                st.setMoney(st.getMoney() + 100);
            }else if(e.getSource().equals(bt2)){
                st.setMoney(st.getMoney() - 100);
            }
        
            tf1.setText(st.getID()+"");
            tf2.setText(st.getName());
            tf3.setText(st.getMoney()+ "");
        }catch(Number­Format­Exception ex){
            System.out.println("Please Enter correct info");
        }
    }
    
    public void windowClosing(WindowEvent we){
        try(FileOutputStream fOut = new FileOutputStream("StudentM.dat");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);){
            oOut.writeObject(st);
            System.out.printf("Serialized data is saved");
            System.out.println("ID: "+st.getID() +"money: "+ st.getMoney() + "Name: "+st.getName());
        }catch(IOException e){
            e.printStackTrace();
        }catch(NullPointerException e3){
            System.exit(0);
        }
    }
    public void windowOpened(WindowEvent we){
        if(new File("StudentM.dat").exists()){
            try(FileInputStream fIn = new FileInputStream("StudentM.dat");
            ObjectInputStream oIn = new ObjectInputStream(fIn);){
            st = (Student)oIn.readObject();
            tf1.setText(st.getID()+"");
            tf2.setText(st.getName());
            tf3.setText(st.getMoney()+"");
            }catch(IOException e){
                e.printStackTrace();
            }catch(ClassNotFoundException c){
                c.printStackTrace();
            }catch(NullPointerException e3){
                System.out.println("No student data found");
            }
        }else{
            //System.exit(0);
        }
    }
    public void windowDeactivated(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowDeiconified(WindowEvent we){}
    public void windowIconified(WindowEvent we){}
    public void windowClosed(WindowEvent we){}
}
