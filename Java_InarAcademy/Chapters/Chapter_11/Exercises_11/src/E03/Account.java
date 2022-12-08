package E03;
import java.util.*;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        //id = 0
        //balance = 0
        //AIR = 0
        dateCreated = new Date();
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        //AIR = 0;
        dateCreated = new Date();
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return ((getAnnualInterestRate() / 100) / 12);
    }
    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate();
    }
    public void withdraw(double withdraw){
        setBalance(getBalance() - withdraw);
    }
    public void deposit(double deposit){
        setBalance(getBalance() + deposit);
    }

    public String toString() {
        return "ClassName = Account\nBalance = " + getBalance() + "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}
