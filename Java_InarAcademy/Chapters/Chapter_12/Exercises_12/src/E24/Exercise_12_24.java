// firstName / lastName / rank / salary
package E24;
import java.util.*;
import java.io.*;
public class Exercise_12_24 {
    public static void main(String[] args) throws Exception {

        File file = new File("/Users/hako/Desktop/Salaryy.txt");

        if(file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }

        StringBuilder sb = new StringBuilder();
        String[] ranks = {"Assistant","Associate","Full"};
        int rank;
        try(
                PrintWriter output = new PrintWriter(file);
                ){
            for(int i = 0; i <= 1000; i++){
                rank = (int)(Math.random() * ranks.length);
                sb = sb.replace(0,sb.length(),ranks[rank]);
                double salary = getSalary(rank);
                output.printf("FirstName%d LastName%d %s %.5f\n", i, i, sb, salary);
            }
        }
    }
    public static double getSalary(int rank){
        if(rank == 1){
            return (Math.random() * 30_000) + 50_000;
        }else if(rank == 2){
            return (Math.random() * 50_000) + 60_000;
        }else{
            return (Math.random() * 55_000) + 75_000;
        }
    }
}
