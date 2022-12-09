package L18;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }

    public static void crawler(String startingUrl) {

        ArrayList<String> listOfPendingURLS = new ArrayList<>();
        ArrayList<String> listOfTraversedURLS = new ArrayList<>();
        listOfPendingURLS.add(startingUrl);

        while (!listOfPendingURLS.isEmpty() && listOfTraversedURLS.size() <= 100) {
            String urlString = listOfPendingURLS.remove(0);
            if (!listOfTraversedURLS.contains(urlString)) {
                listOfTraversedURLS.add(urlString);
                System.out.println("Craw " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLS.contains(s))
                        listOfPendingURLS.add(s);
                }
            }

        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL URL = new java.net.URL(urlString);
            Scanner input = new Scanner(URL.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());


        }
        return list;
    }
}
