package E01;
import java.util.*;
public class Exercise_12_01 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: Java Exercise_12_01 Operator Error");
            System.exit(1);
        }
        if (!isNumber(args[0])) {
            System.out.println("Wrong input: " + args[0]);
            System.exit(2);
        }
        if (!isNumber(args[2])) {
            System.out.println("Wrong input " + args[2]);
            System.exit(3);
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '.':
                result = a * b;
                break;
            case '/':
                result = a / b;
        }
        System.out.println(a + " " + args[1] + " " + b +
                " = " + result);
    }


    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) { return false; }
        }
        return true;
    }
    public static void displayInputError(String arg) {
        System.out.println("Wrong input: " + arg);
    }
}
