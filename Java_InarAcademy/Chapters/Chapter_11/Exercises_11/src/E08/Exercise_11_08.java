package E08;
import java.util.*;
public class Exercise_11_08 {
    public static void main(String[] args) {
        Account a1 = new Account("Hamza",123,135345);
        System.out.println(a1);
        a1.setAnnualInterestRate(2.7);

        a1.deposit(2543);
        a1.withdraw(345);
        a1.deposit(4325);
        a1.withdraw(432);

        System.out.println();
        System.out.println(a1);
    }
}
