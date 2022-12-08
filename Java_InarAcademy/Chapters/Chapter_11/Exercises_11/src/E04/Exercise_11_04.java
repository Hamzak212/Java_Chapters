package E04;
import java.util.*;
public class Exercise_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser();
        Integer number = max(list);
        System.out.println("Largest element in the list is " + number);
        System.out.println("Size of the list is " + list.size());
    }
    public static Integer max(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return null;
        }

        int max = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;

    }
    public static ArrayList<Integer> getFromUser(){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers for ArrayList: ");
        int user;
        for(int i = 0; i < 1000; i++){
            user = input.nextInt();
            if(user != 0){
                list.add(i, user);
            }else{
                i = 1000;
            }

        }
        return list;
    }
}
