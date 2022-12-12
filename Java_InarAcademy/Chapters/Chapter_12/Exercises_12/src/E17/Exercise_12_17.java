package E17;
import java.util.*;
import java.io.*;
public class Exercise_12_17 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = getWordsFromFile();
        playHangman(words);
    }
    public static void playHangman(ArrayList<String> words){
        Scanner input = new Scanner(System.in);
        String word;

        do{
            word = words.get((int)(Math.random() * words.size()));
            char[] answer = new char[word.length()];
            askUser(word,answer);

            System.out.println("Do you want to guess another word? Y/N ");

        }while(input.next().toLowerCase().charAt(0) == 'y');
    }
    public static void askUser(String word, char[] answer){
        Scanner input = new Scanner(System.in);
        fill(answer, '*');
        int missCount = 0;

        while(true){
            System.out.println("Guess a letter: ");
            printTheWordInAsterisk(answer);

            char ch = input.next().toLowerCase().charAt(0);
            missCount += checkLetter(word, answer, ch);

            if(checkAnswer(word, answer)){
                break;
            }
        }

        System.out.println("The word is " + word);
        if(missCount == 0){
            System.out.println("0 Errors!");
        }else{
            System.out.println("You missed " + missCount + " times.");
        }

    }
    public static boolean checkAnswer(String word, char[] answer){
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != answer[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean contains(char[]answer, char guess){
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == guess){
                return true;
            }
        }
        return false;
    }
    public static int checkLetter(String word, char[] answer, char guess){
        for(int i = 0; i < answer.length; i++){
            if(word.toLowerCase().charAt(i) == guess){
                answer[i] = word.charAt(i);
            }
        }
        return contains(answer, guess) ? 1 : 0;
    }
    public static void printTheWordInAsterisk(char[] answer){
        for(int i = 0; i < answer.length;i++){
            System.out.print(answer[i]);
        }
        System.out.println(" > ");
    }
    public static void fill(char[] answer, char ch){
        for(int i = 0; i < answer.length; i++){
            answer[i] = ch;
        }
    }
    public static ArrayList<String> getWordsFromFile() throws Exception{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a file's pathname for Hangman words: ");
        String path = input.nextLine();

        File file = new File(path);

        if(!file.exists()){
            System.out.println("File does not exist!");
            System.exit(1);
        }
        ArrayList<String> words = new ArrayList<>();
        try(
                Scanner input1 = new Scanner(file);
                ){
            while(input1.hasNext()){
                words.add(input1.next());
            }
        }
        return words;
    }
}
