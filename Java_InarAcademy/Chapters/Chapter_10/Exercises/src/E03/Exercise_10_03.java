package E03;
import java.util.*;
public class Exercise_10_03 {
    public static void main(String[] args) {



        MyInteger num = new MyInteger(getValue());

        System.out.println("Is Number Prime => " + num.isPrime());
        System.out.println("Is Number Odd => " + num.isOdd());
        System.out.println("Is Number Even => " + num.isEven());
    }
    public static int getValue() {
        Scanner input = new Scanner(System.in);
        System.out.println("\t\tPrime / Odd / Even Calculator");
        System.out.println("\t\t\tEnter an Integer: ");
        int value = input.nextInt();

        return value;
    }
}
