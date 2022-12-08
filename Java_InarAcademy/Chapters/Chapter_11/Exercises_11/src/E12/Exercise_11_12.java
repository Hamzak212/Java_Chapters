package E12;
import java.util.*;
public class Exercise_11_12 {
    public static void main(String[] args) {
        ArrayList<Double> num = getFromUser();
        System.out.println("Sum of the list is: " + sum(num));
    }
    public static double sum(ArrayList<Double> num){
        double sum = 0;
        for(int i = 0; i < num.size(); i++){
            sum += num.get(i);
        }
        return sum;
    }
    public static ArrayList<Double> getFromUser(){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> num = new ArrayList<>();
        System.out.println("Enter 5 Numbers to add: ");
        for(int i = 0; i < 5; i++){
            num.add(input.nextDouble());
        }
        return num;
    }
}
