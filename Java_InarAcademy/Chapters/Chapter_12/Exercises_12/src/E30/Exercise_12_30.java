package E30;
import java.util.*;
import java.io.*;

public class Exercise_12_30 {
    public static void main(String[] args) throws Exception{
        //get File from user
        File file = getFromUser();

        //If file does not exist give message
        if(!file.exists()){
            System.out.println("File Does not exist.");
            System.exit(1);
        }
        //put occurrences of each letter into an array 0 is A - 25 is Z
        int[] occurrencesOfChar = getOccurrences(file);

        //display using occurrencesOfChar[i] with a for loop
        displayOccurrencesOfLetter(occurrencesOfChar);
    }
    private static void displayOccurrencesOfLetter(int[] occurrencesOfChar){
        for(int i = 0; i < occurrencesOfChar.length; i++){
            System.out.printf("Number of %c's: %d\n", ('A' + i), occurrencesOfChar[i]);
        }
    }
    private static int[] getOccurrences(File file) throws IOException{
        int[] countOccurrences = new int['Z' - 'A' + 1];
        String s;
        try(Scanner input = new Scanner(file)){
            while(input.hasNext()){
                s = input.next().toUpperCase();
                for(int i = 0; i < s.length(); i++){
                    if(Character.isLetter(s.charAt(i))){
                        countOccurrences[s.charAt(i) - 'A']++;
                    }
                }
            }
        }
        return countOccurrences;
    }

    private static File getFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory name: ");
        String directory = input.nextLine();
        File file = new File(directory);
        return file;
    }
}
