package E17;
import java.math.BigInteger;
import java.util.*;
public class Exercise_11_17 {
    public static void main(String[] args) {
        int m = getFromUser();
        int n = findN(m);
        System.out.println(n);
    }

    public static int getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer m: ");
        int m = input.nextInt();
        return m;
    }

    public static int findN(int m) {
        int i = 3;
        while (!isPrime(m, i)) {
            i++;
        }
        return i;
}
    public static boolean isPrime(int m, int i){
        if(Math.sqrt(m * i) % 2 == 0 || Math.sqrt(m * i) % 1 == 0){
            return true;
        }else{
            return false;
        }
    }

}
