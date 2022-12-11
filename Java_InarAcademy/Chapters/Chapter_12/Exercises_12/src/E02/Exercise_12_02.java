package E02;
import java.util.*;
public class Exercise_12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1,n2;

        while(true){
            System.out.print("\nEnter two integers: ");
            try{
                n1 = input.nextInt();
                n2 = input.nextInt();
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            }catch(InputMismatchException ex){
                System.out.println("Invalid input!");
                input.nextLine();
            }
        }
    }
}
