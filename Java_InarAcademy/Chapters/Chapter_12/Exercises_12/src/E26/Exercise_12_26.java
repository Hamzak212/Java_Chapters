package E26;
import java.util.*;
import java.io.*;
public class Exercise_12_26 {
    public static void main(String[] args) {
        File directory = getFile();

        if(directory.exists()){
            System.out.println("Directory already exists.");
            System.exit(1);
        }else if(directory.mkdir()){
            System.out.println("Directory Successfully Created!");
        }else{
            System.out.println("There was a problem with your request.");
        }

    }
    private static File getFile(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String directory = input.nextLine();
        File file = new File(directory);
        return file;
    }
}
