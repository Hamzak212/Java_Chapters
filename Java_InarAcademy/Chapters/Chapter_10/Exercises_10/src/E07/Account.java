package E07;
import java.util.*;
public class Account {


    private int id;
    private double balance;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }

    public Account(int id, double balance){

        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double withdraw){
        setBalance(getBalance() - withdraw);
    }

    public void deposit(double deposit){
        setBalance(getBalance() + deposit);
    }
}
