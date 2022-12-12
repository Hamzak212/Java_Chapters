package E21;
import java.util.*;
import java.io.*;
public class Exercise_12_21 {
    public static void main(String[] args) {
        File file = getFileFromUser();

        try{
            System.out.println("Is the file sorted: " + isFileSorted(file));
        }catch (Exception ex){
            System.out.println("File does not exist.");
        }
    }
    public static boolean isFileSorted(File file) throws Exception{
        String s1;
        String s2 = null;
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                s1 = input.next();
                if(s2 != null){
                    if(s2.compareToIgnoreCase(s1) > 0){
                        return false;
                    }
                }
                s2 = s1;
            }
            return true;
        }
    }
    public static File getFileFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        File file = new File(fileName);

        return file;
    }
}
