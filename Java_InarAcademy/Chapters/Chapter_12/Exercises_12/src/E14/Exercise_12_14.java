package E14;
import java.util.*;
import java.io.*;
public class Exercise_12_14 {
    public static void main(String[] args) {
        File file = getFileFromUser();

        if(!file.exists()){
            System.out.println("File does not exist!");
            System.exit(1);
        }
        try{
            displaySumAndAverage(file);
        }
        catch(Exception ex){
            System.out.println("File does not work!");
        }
    }
    private static void displaySumAndAverage(File file) throws Exception{
        int count = 0;
        double sum = 0;
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                sum += input.nextDouble();
                count++;
            }
            System.out.printf("Sum of the numbers in the file: %f\nNumber of integers: %d\nAverage: %.2f"
                    ,sum, count, (sum / count));
        }

    }
    private static File getFileFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file path: ");
        String s = input.nextLine();
        return new File(s);
    }
}
