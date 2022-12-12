package E19;
import java.net.MalformedURLException;
import java.util.*;
import java.io.*;
import java.net.URL;
public class Exercise_12_19 {
    public static void main(String[] args) throws Exception {

        URL url = getFromUser();

        String line;
        String[] s;
        int count = 0;

        try(
                Scanner input = new Scanner(url.openStream());
                ){
            while(input.hasNext()){
                line = input.nextLine() + "\n";
                s = line.split(" ");
                count += s.length;
            }
        }

        System.out.println("\n" + url.toString() + " has " + count + " words.");

    }
    public static URL getFromUser() throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL to check word count: ");
        String link = input.nextLine();
        URL url = new URL(link);
        return url;
    }
}
