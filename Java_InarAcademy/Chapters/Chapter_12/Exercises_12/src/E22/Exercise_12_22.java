package E22;
import java.util.*;
import java.io.*;
public class Exercise_12_22 {
    public static void main(String[] args) throws Exception {
        File directory = new File("/Users/hako/Desktop/test.txt");

        if(!directory.exists()){
            System.out.println("Directory " + directory.getName() + " not exist.");
            System.exit(1);
        }

        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);

        while(!directories.isEmpty()){
            File file = directories.remove(0);
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(int i = 0; i < files.length; i++){
                    if(files[i].isDirectory()){
                        directories.add(files[i]);
                    }else{
                        replaceString(files[i], "a", "rip");
                    }
                }
            }
        }
    }
    private static void replaceString(File file, String oldString, String newString) throws IOException{
        String s = "";
        StringBuilder sb = new StringBuilder();
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                s = input.nextLine();
                sb.append(s.replaceAll(oldString,newString) + "\n");
            }
            try(
                    PrintWriter output = new PrintWriter(file);
                    ){
                output.print(sb);
            }
        }
    }
}
