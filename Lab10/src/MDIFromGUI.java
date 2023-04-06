import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame fr1,fr2,fr3;
    
    private JMenuBar mb;
    private JMenu m1,m2,m3,ms1;
    private JMenuItem mi1,mi2,mi3,msi1,msi2;
    public MDIFromGUI(){
        mb = new JMenuBar();
        this.setJMenuBar(mb);
        
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        ms1 = new JMenu("new");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        
        m1.add(ms1);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        desktopPane = new JDesktopPane();
        fr1 = new JInternalFrame("Application 01",true,true,true,true);
        fr2 = new JInternalFrame("Application 02",true,true,true,true);
        fr3 = new JInternalFrame("Application 03",true,true,true,true);
        
        fr1.setSize(180,100);
        fr2.setSize(180,120);
        fr3.setSize(280,200);
        
//        fr1.setLocation(this.getHeight()/3, 10);
//        fr2.setLocation(this.getHeight()/5, this.getWidth()/4);
//        fr3.setLocation(this.getHeight()/3, this.getWidth()/4*2);
        
        fr1.setLocation(5, 200);
        fr2.setLocation(150, 50);
        fr3.setLocation(350, 150);
        

        fr1.setVisible(true);
        fr2.setVisible(true);
        fr3.setVisible(true);
        
        //fr1.setLocation(, WIDTH);
        
        desktopPane.add(fr1);
        desktopPane.add(fr2);
        desktopPane.add(fr3);
        
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(700,400));
        this.pack();
        this.setVisible(true);
        //this.setExtendedState(this.MAXIMIZED_BOTH);
    }
}
