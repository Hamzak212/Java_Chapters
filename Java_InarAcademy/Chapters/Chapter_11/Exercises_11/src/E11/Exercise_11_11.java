package E11;
import java.lang.reflect.Array;
import java.util.*;
public class Exercise_11_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> num = getFromUser(input);
        System.out.println(num);
        System.out.println("--------------------------");
        sortListInDecreasingOrder(num);
        System.out.println(num);

    }

    public static void sortListInDecreasingOrder(ArrayList<Integer> num){
        int min;
        int index;
        for(int i = 0; i < num.size() - 1; i++){
            min = num.get(i);
            index = i;
            for(int j = i + 1; j < num.size(); j++){
                if(min > num.get(j)){
                    min = num.get(j);
                    index = j;
                }
            }
            if(index != i){
                num.set(index, num.get(i));
                num.set(i, min);
            }
        }
    }
    public static ArrayList<Integer> getFromUser(Scanner input){
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter 5 Numbers: ");
        for(int i = 0; i < 5; i++){
            num.add(input.nextInt());
        }
        return num;
    }

}
