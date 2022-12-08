package E03;

public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount(){
        overdraftLimit = 100;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit){
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount){
        if(getBalance() + overdraftLimit < amount){
            System.out.println("Out of Limits!");
        }else{
            setBalance(getBalance() - amount);
        }
    }
    public String toString() {
        return "ClassName = CheckingAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}