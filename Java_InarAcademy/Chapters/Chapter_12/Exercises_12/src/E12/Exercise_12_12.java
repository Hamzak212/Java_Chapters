package E12;
import java.util.*;
import java.io.*;
public class Exercise_12_12 {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            System.out.println("Usage: java E12_12 [filename]");
            System.exit(1);
        }
        File file = new File(args[0]);

        if(!file.exists()){
            System.out.println("File is not found.");
            System.exit(2);
        }

        String s = "";

        try(
            Scanner input = new Scanner(file);
        ) {
            while(input.hasNext()){
                s += input.nextLine() + " \n";
            }
            s = s.replaceAll("\n\\s*\\{", " {");
        }
        try(PrintWriter out = new PrintWriter(file)){
            out.print(s);
        }
    }
}
