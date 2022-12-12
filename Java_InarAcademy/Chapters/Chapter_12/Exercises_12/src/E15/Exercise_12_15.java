package E15;
import java.util.*;
import java.io.*;
public class Exercise_12_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("/Users/hako/Desktop/Exercise_12_15.txt");
        if(file.exists()){
            System.out.println("There is already a file with this name!");
            System.exit(1);
        }
        writeRandomNumbers(file, 100);

        ArrayList<Integer> sortedList = sortList(file);
        displayList(sortedList);

    }
    private static void displayList(ArrayList<Integer> list){
        int count = 0;
        while(!list.isEmpty()){
            count++;
            System.out.printf("%3d ", list.remove(0));
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }
    private static ArrayList<Integer> sortList(File file) throws Exception{
        ArrayList<Integer> list = new ArrayList<>();
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                list.add(input.nextInt());
            }
        }
        Collections.sort(list);
        return list;
    }
    private static void writeRandomNumbers(File file, int max) throws Exception{
        try(
            PrintWriter output = new PrintWriter(file);

        ){
            for(int i = 0; i < max; i++){
                int random = (int)(Math.random() * 1000);
                output.print(random + " ");
            }
        }
    }
}
