package L17;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;
public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.println("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try{
            java.net.URL url = new java.net.URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());
            while(input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is " + count + " characters");

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("No such Files");
        }
    }
}
