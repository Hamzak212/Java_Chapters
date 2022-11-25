package E17;
import java.math.BigInteger;
import java.util.*;
public class Exercise_10_17 {
    public static void main(String[] args) {
        displayNumbers(10);
    }
    public static void displayNumbers(int i){
        long sqrt = (long)(Math.sqrt(Long.MAX_VALUE)) + 1;
        BigInteger number;
        number = new BigInteger(sqrt + "");

        System.out.println("Max Value is => " + Long.MAX_VALUE);
        for (int j = 0; j < i; j++) {
            System.out.println(number.multiply(number));
            number = number.add(BigInteger.ONE);
        }
    }
}
