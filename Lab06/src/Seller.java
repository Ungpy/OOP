
public class Seller extends Employee{
    public Food sell(Employee e){
        Food food = new Food();
        if(e.getWallet().getBalance() >= food.getPrice()){
            this.getWallet().setBalance(this.getWallet().getBalance() + food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance() - food.getPrice());
            return food;
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
