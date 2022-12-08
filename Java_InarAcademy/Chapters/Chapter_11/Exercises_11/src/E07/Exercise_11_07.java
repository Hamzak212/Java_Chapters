package E07;
import java.util.*;
public class Exercise_11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Before Shuffling => ");
        fill(list);
        displayList(list);

        shuffle(list);
        System.out.println("After Shuffling => ");
        displayList(list);
    }
    public static void shuffle(ArrayList<Integer> list){
        int temp;
        int index;
        for(int i = 0; i < list.size(); i++){
            index = (int)(Math.random() * list.size());
            temp = list.get(index);

            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }
    public static void displayList(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    public static void fill(ArrayList<Integer> list){
        for(int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 100));
        }
    }
}
