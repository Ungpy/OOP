import java.awt.event.*;
public class TestThread extends Thread implements MouseListener{
    public TestThread(Runnable c){
        super(c);
    }
    
//    public void run(){
//        
//    }
    
    public synchronized void mouseClicked(MouseEvent me){
        if(!this.isAlive()){
            this.notify();
        }else{
            try {
            this.wait();
            } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        }
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
}
