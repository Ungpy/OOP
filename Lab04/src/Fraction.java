
public class Fraction {
    public int topN;
    public int btmN;
    public String toFraction(){
        String output = topN + "/" + btmN;
        return output;
    }
    public String toFloat(){
        double output = (topN*1.0)/(btmN*1.0);
        return output+"";
    }
    public void addFraction(Fraction f){
        if(btmN == f.btmN){
            topN += f.topN; 
        }
        else{
            topN = topN*f.btmN + f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
}
