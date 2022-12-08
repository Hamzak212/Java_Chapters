package Listing_11_09;
import java.util.*;
public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter Integers: ");
        int value;
        do{
            value = input.nextInt();
            if((!list.contains(value)) && value != 0){
                list.add(value);
            }
        }while(value != 0);


        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
