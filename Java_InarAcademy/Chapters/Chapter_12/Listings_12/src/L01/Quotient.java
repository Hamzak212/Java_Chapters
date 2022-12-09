package L01;
import java.util.*;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Two Integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
    }
}
