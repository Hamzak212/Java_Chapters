package E21;
import java.math.BigInteger;
import java.util.*;
public class Exercise_10_21 {
    public static void main(String[] args) {
        displayDivisible(10);

    }
    public static void displayDivisible(int i){
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        int count = 0;

        while(count < i){
            if(isDivisible(number)){
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

    }
    public static boolean isDivisible(BigInteger number){
        return number.remainder(new BigInteger("5")).equals(BigInteger.ZERO)||
                number.remainder(new BigInteger("6")).equals(BigInteger.ZERO);
    }
}
