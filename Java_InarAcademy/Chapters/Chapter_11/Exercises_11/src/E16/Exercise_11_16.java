package E16;
import java.util.*;
public class Exercise_11_16 {
    public static void main(String[] args) {
        additionQuiz();
    }
    public static void additionQuiz(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> answers = new ArrayList<>();
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        int answer = -5;
        while(num1 + num2 != answer){
            System.out.println("What is " + num1 + " + " + num2 + "?");
            answer = input.nextInt();
            if(num1 + num2 != answer){
                System.out.println("Wrong answer, try again!");
            }else{
                System.out.println("Correct!");
            }
            answers.add(answer);
        }
        System.out.println("Your answers were " + answers);
    }
}
