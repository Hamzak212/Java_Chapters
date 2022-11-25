package E07;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int j){
        //default account
        dateCreated = new Date();
    }
    public Account(int newId, double newBalace){
        //specified balance and id
        id = newId;
        balance = newBalace;
        dateCreated = new Date();
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public String getDateCreated(){
        return dateCreated.toString();
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate() / 100) / 12;
    }
    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate();
    }
    public void withdraw(double withdrawAmount){
        setBalance(getBalance() - withdrawAmount);
    }
    public void deposit(double depositAmount){
        setBalance(getBalance() + depositAmount);
    }
}
