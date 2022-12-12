package E22;

import java.net.MalformedURLException;
import java.util.*;
import java.net.URL;
public class wordCount {
    public static void main(String[] args) throws Exception {
        URL link = getFromUser();

        char searchLetter = getLetterFromUser();
        String line;
        String[] s;
        int count = 0;
        try(
                Scanner input = new Scanner(link.openStream());
                ){
            while(input.hasNext()){
                line = input.nextLine() + "\n";
                s = line.split("searchLetter");
                count += s.length;
            }
        }
        System.out.println(link.toString() + " has " + count + " letter " +  searchLetter + "'s");
    }
    public static char getLetterFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter to search for: ");
        char letter = input.next().charAt(0);
        return letter;
    }
    public static URL getFromUser() throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL to check word count: ");
        String link = input.nextLine();
        URL url = new URL(link);
        return url;
    }
}
