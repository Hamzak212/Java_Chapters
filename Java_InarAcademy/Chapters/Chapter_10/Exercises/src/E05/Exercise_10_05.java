package E05;
import java.util.*;
public class Exercise_10_05 {
    public static void main(String[] args) {

        int value = getFromUser();
        StackOfIntegers factors = getFactors(value);
        displayReversed(factors);
    }
    public static void displayReversed(StackOfIntegers factors){
        StackOfIntegers Factors = new StackOfIntegers();
        while(!factors.empty()){
            System.out.print(factors.peek() + " ");
            Factors.push(factors.pop());
        }
    }

    public static StackOfIntegers getFactors(int value){
        StackOfIntegers factors = new StackOfIntegers();

        int k = 2;
        while(value != 1){
            if(value % k == 0){
                factors.push(k);
                value /= k;
            }else{
                k++;
            }
        }
        return factors;
    }


    public static int getFromUser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Number to Prime Factors => ");
        int number = input.nextInt();
        return number;
    }
}
