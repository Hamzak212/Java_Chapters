package E16;
import java.math.BigInteger;
import java.util.*;
public class Exercise_10_16 {
    public static void main(String[] args) {
        displayNumbers(10);

    }
    public static void displayNumbers(int i){
        int count = 0;
        BigInteger number = new BigInteger("100000000000000000000000000000000000000000000000000");

        while(count < i){
            if((number.remainder(new BigInteger("2")).equals(BigInteger.ZERO))||
                    (number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)));{
                System.out.print(count + 1 + ": ");
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
