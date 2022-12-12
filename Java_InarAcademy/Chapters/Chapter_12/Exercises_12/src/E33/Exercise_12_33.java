package E33;
import java.io.*;
import java.net.*;
import java.util.*;
public class Exercise_12_33 {
    public static void main(String[] args) {
        String url = getURLFromUser();
        crawler(url);

    }
    public static void crawler(String startingURL){
        ArrayList<String> listOfTransversedURLS = new ArrayList<>();
        ArrayList<String> listOfPendingURLS = new ArrayList<>();

        listOfPendingURLS.add(startingURL);
        while(!listOfPendingURLS.isEmpty()){
            String urlString = listOfPendingURLS.remove(0);
            if(!listOfTransversedURLS.contains(urlString)){
                listOfTransversedURLS.add(urlString);
                System.out.println("Craw " + urlString);

                for(String s: getSubURLS(urlString)){
                    if(!listOfTransversedURLS.contains(s)){
                        listOfPendingURLS.add(s);
                    }
                }
                System.out.println("There isn't any url that contains the word that you look for!");

            }
        }
    }
    public static ArrayList<String> getSubURLS(String urlString){
        ArrayList<String> list = new ArrayList<>();

        try{
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                if(line.contains("Computer Programming")){
                    System.out.println("The word has been found!");
                    System.exit(1);
                }
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) {// Ensure that a correct URL is found
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

    public static String getURLFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String s = input.nextLine();
        return s;
    }
}
