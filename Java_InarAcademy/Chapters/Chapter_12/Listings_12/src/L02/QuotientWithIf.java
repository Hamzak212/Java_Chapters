package L02;
import java.util.*;
public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num2 != 0){
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }else{
            System.out.println("Divisor Cannot be 0.");
        }
    }
}
