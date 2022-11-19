/**  Write a test program that creates an Account object with an account ID of 1122,
 a balance of $20,000, and an annual interest rate of 4.5%. Use the withdrawal
 method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 the balance, the monthly interest, and the date when this account was created. */
package E07;

public class Exercise_09_07 {
    public static void main(String[] args) {
        Account first = new Account(1122,20000);

        first.setAnnualInterestRate(4.5);
        first.withdraw(2500);
        first.deposit(3000);
        System.out.println("Account ID: " + first.getId() + "\nAccount Balance: " + first.getBalance() +
                "\nMonthly Interest Rate: " + first.getMonthlyInterestRate() + "\nAccount Created Date: " + first.getDateCreated());
    }
}
