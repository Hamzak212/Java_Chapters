package E04;
import java.util.*;

public class Exercise_12_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter Annual interest rate: ");
            double interestRate = input.nextDouble();
            System.out.print("\nEnter number Of Years: ");
            int numberOfYears = input.nextInt();
            System.out.print("\nEnter Loan Amount: ");
            double loanAmount = input.nextDouble();
            try{
                Loan loan1 = new Loan(interestRate,numberOfYears,loanAmount);
                System.out.println("\nTotal Payment: \t" + loan1.getTotalPayment());
                break;
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
