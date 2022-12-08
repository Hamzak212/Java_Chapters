package E08;
import java.util.*;
public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    public Account(){

        this(0,0);
    }
    public Account(int id, double balance){
        this(null, id, balance);
        dateCreated = new Date();
    }
    public Account(String name, int id, double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        annualInterestRate = annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 100) / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        Transaction t = new Transaction('W',amount, balance, "");
        setBalance(getBalance() - amount);
        transactions.add(t);
    }
    public void deposit(double depositAmount){
        Transaction t = new Transaction('D',depositAmount, balance, "");
        setBalance(getBalance() + depositAmount);
        transactions.add(t);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < transactions.size(); i++){
            sb.append(transactions.get(i));
        }
        return "name: " + name + "\nbalance: " + getBalance() + "\nmonthly interest: " + getMonthlyInterest() +
                "\ndate created: " + getDateCreated() + "\nTransactions: " + sb;
    }
}
