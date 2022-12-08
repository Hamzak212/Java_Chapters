package E03;

public class SavingsAccount extends Account{

    public SavingsAccount(){
    }

    public SavingsAccount(int id, double balance){
        super(id,balance);
    }
    public void withdraw(double amount){
        if(amount <= getBalance()){
            setBalance(getBalance() - amount);
        }else{
            System.out.println("You do not have $" + amount + " in your account!");
        }
    }
    public String toString() {
        return "ClassName = SavingsAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}
