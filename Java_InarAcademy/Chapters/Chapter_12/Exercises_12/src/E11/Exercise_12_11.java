package E11;
import java.io.*;
import java.util.*;
public class Exercise_12_11 {
    public static void main(String[] args) throws Exception {
        if(args.length != 2){
            System.out.println("Usage: java Exercise12_11 " +
                    "StringThatWillRemoved fileName");
            System.exit(1);
        }

        File file = new File(args[1]);
        String s = "";
        StringBuilder sb1 = new StringBuilder();

        try(Scanner input = new Scanner(file)){
            while(input.hasNext()){
                s = input.nextLine();
                sb1.append(s.replaceAll(args[0] + " ","") + "\n");
            }
        }

        try (PrintWriter output = new PrintWriter(file)){
            output.print(sb1);
        }
    }
}
