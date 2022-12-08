package E08;
import java.util.*;
public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }
    public char getType(){
        return type;
    }
    public Date getDate(){
        return date;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setType(char type){
        this.type = type;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =  description;
    }
    public String toString(){
        return "\nDate: " + getDate() + "\nType: " + type + "\nAmount: " + getAmount() + "\nBalance: " + getBalance() +
                "\nDescription: " + getDescription();
    }

}
