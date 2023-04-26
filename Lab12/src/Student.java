import java.io.*;
public class Student implements Serializable{
    String name;
    int ID, money;
    
    public Student(){
        
    }
    public Student(String name, int ID, int money){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
}
