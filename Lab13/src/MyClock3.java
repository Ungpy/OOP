import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
public class MyClock3 extends JLabel implements Runnable/*,MouseListener*/{
    public boolean pause = false;
    
    public synchronized void stop(){
        pause = true;
    }
    
    public synchronized void resume(){
        pause = false;
        this.notify();
    }
    
    public synchronized void checkpause(){
        while(pause){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    } 
    public void run(){
        int sec=0,min=0,hour = 0;
        while(true){
            checkpause();
            sec += 1;
            if(sec>= 60){
                sec = 0;
                min += 1;
            }if(min >= 60){
                min = 0;
                hour += 1;
            }
            
            if(hour < 10){
                this.setText("0"+hour+":");
            }else{
                this.setText(hour+":");
            }
            if(min < 10){
                this.setText(this.getText()+"0"+min+":");
            }else{
                this.setText(this.getText()+min+":");
            }
            if(sec < 10){
                this.setText(this.getText()+"0"+sec);
            }else{
                this.setText(this.getText()+sec);
            }
            this.setFont(new Font(this.getText(), Font.ITALIC, 25));
            
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
//    public synchronized void mouseClicked(MouseEvent me){
//        if(pause){
//            this.notify();
//            pause = false;
//        }else{
//            stop();
//        }
//    }
//    public void mouseEntered(MouseEvent me){}
//    public void mouseExited(MouseEvent me){}
//    public void mousePressed(MouseEvent me){}
//    public void mouseReleased(MouseEvent me){}
    

}