package E10;
import java.util.*;
public class Exercise_11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack s = getFromUser(input);
        int size = s.getSize();

        for(int i = 0; i < size; i++){
            System.out.println(s.pop());
        }

    }
    public static MyStack getFromUser(Scanner input){
        MyStack s = new MyStack();
        System.out.println("Enter Five Strings: ");
        for(int i = 0; i <= 5; i++){
            s.push(input.next());
        }
        return s;
    }
}
