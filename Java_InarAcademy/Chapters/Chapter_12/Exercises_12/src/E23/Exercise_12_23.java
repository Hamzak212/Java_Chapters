package E23;
import java.util.*;
import java.io.*;
import java.net.*;
public class Exercise_12_23 {
    public static void main(String[] args) throws Exception{
        URL url = getFromUser();

        double sum = 0;
        int count = 0;
        try(
                Scanner input = new Scanner(url.openStream());
                ){
            while(input.hasNext()){
                sum += input.nextDouble();
                count++;
            }
        }
        System.out.printf("Sum of Scores: %.2f\nAverage of Scores %.1f", sum, (sum/count));
    }
    private static URL getFromUser() throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n - \nSCORE CALCULATOR\n - \n");
        System.out.print("Link Of Scores => ");
        String link = input.nextLine();
        URL url = new URL(link);
        return url;
    }
}
