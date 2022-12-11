package E03;
import jdk.internal.util.xml.impl.Input;
import java.sql.SQLOutput;
import java.util.*;
public class Exercise_12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //create an array with size 100 of random integers 0-10,000.
        int[] arr = getRandom(100);

        //initialize i.
        int i;

        //while true loop - asks for index repeatedly until 'N'
        while(true){
            //ask for input from user and record it as 'i'.
            System.out.println("Enter An Index: ");
            i = input.nextInt();
            //create try/catch for out of bounds exceptions to keep asking when incorrect.
            try{
                //if index is valid it will print out the array at that index.
                System.out.println("Index " + i + " is " + arr[i]);
            //if index is not valid out-of-bounds exception is reached.
            }catch(ArrayIndexOutOfBoundsException ex){
                //informs user.
                System.out.println("Out of Bounds!");
            }
            //outside of try/catch - Asking if you want to 'break;' out of the while loop.
            System.out.println("Do you want to quit? Y/N : ");
            char decision = input.next().toUpperCase().charAt(0);
            if(decision == 'Y'){
                System.out.println("Biy");
                break;
            }
        }
    }
    public static int[] getRandom(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random() * 10000);
        }
        return arr;
    }
}
