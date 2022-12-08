package E14;
import java.util.*;
public class Exercise_11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = getFromUser(input);
        ArrayList<Integer> list2 = getFromUserAgain(input);
        ArrayList<Integer> union = union(list1, list2);
        System.out.println(union);
    }
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0; i < list1.size(); i++){
            union.add(list1.get(i));
            union.add(list2.get(i));
        }
        return union;
    }
    public static ArrayList<Integer> getFromUser(Scanner input){
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.print("Enter 5 Integers: ");
        for(int i = 0; i < 5; i++){
            list1.add(input.nextInt());
        }
        return list1;
    }
    public static ArrayList<Integer> getFromUserAgain(Scanner input){
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter 5 Integers: ");
        for(int i = 0; i < 5; i++){
            list2.add(input.nextInt());
        }
        return list2;
    }
}
