
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0, "", 0);
    }
    
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if(credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    
    public double getCredit(){
        return credit;
    }
    
    public void withdraw(double a){
        if(this.balance >= a){
            this.balance -= a;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        else if((this.balance + this.credit) >= a){
            this.credit -= a - balance;
            this.balance = 0;
            System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    
    public String toString(){
        return ("The " + this.name+ " account has "+ this.balance+ " baht and " + this.credit+ " credits.");
    }
}