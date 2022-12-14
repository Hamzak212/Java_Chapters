package L03;
import java.util.*;
public class QuotientWithMethod {
    public static int quotient(int number1, int number2){
        if(number2 == 0){
            System.out.println("Divisor cannot be 0.");
            System.exit(1);
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int result = quotient(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + result);
    }
}
