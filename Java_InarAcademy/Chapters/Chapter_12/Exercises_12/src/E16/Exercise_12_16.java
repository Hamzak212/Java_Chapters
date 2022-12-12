package E16;
import java.util.*;
import java.io.*;
public class Exercise_12_16 {
    public static void main(String[] args) throws Exception {
        File sourceFile = new File("/Users/hako/Desktop/Exercise_12_15.txt");
        File targetFile = new File("/Users/hako/Desktop/HAMKO.txt");

        String oldWord = "HELLO";
        String newWord = "BYE";
        replaceWords(sourceFile, oldWord, targetFile, newWord);
    }
    private static void replaceWords(File sourceFile, String oldWord, File targetFile, String newWord) throws Exception{

        String s = "";
        StringBuilder sb1 = new StringBuilder();
        try(
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
                ){
            while(input.hasNext()){
                s = input.nextLine();
                sb1.append(s.replaceAll(oldWord, newWord) + "\n");
            }
            output.print(sb1);
        }
    }
}
