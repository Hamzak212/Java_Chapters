package E13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser();
        removeDuplicate(list);
        System.out.println(list);
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            list.remove(i);
            if (list.contains(num)) {
                i--;
            }else{
                list.add(num);
            }

        }
    }
    public static ArrayList<Integer> getFromUser(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 Integers: ");
        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }
        return list;
    }
}

