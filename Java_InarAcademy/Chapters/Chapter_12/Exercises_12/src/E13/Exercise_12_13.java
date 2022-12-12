package E13;
import java.util.*;
import java.io.*;
public class Exercise_12_13 {
    public static void main(String[] args) throws Exception{
        if(args.length != 1){
            System.out.println("Usage: File");
            System.exit(1);
        }

        File file = new File("week3_q1.java");
        if(!file.exists()){
            System.out.println("File does not exist!");
            System.exit(2);
        }

        String s = "";
        int wordCount = 0;
        int lineCount = 0;
        int characterCount = 0;
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                s = input.nextLine();
                lineCount++;
                characterCount += getCountCharacter(s);
                wordCount += getCountWord(s);
            }
        }
        System.out.println("Number of Words: " + wordCount + "\nNumber of Lines: " +
                lineCount + "\nCharacter Count: " + characterCount);

    }
    private static int getCountWord(String s){
        String[] Array = s.split(" ");
        return Array.length;
    }
    private static int getCountCharacter(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(!(s.charAt(i) == ' ') && !(s.charAt(i) == '\n')){
                count++;
            }
        }
        return count;
    }
}
