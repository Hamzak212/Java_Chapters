package E18;
import java.util.*;
import java.io.*;
public class Exercise_12_18 {
    public static void main(String[] args) throws Exception {
        File directory = new File("/Users/hako/Desktop/Document.txt");

        if(!(directory.exists()) || !(directory.isDirectory())){
            if(!directory.exists()){
                System.out.println(directory.getName() + " does not exist.");
                System.exit(1);
            }
            if(!directory.isDirectory()){
                System.out.println(directory.getName() + " is not a directory.");
                System.exit(2);
            }
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
                    }
                    if(files[i].isFile() && files[i].getName().endsWith(".java"));
                    insertPackageName(files[i]);
                }

            }
        }
    }
    public static void insertPackageName(File file) throws IOException{
        String[] s1 = file.getParent().split("\\\\");
        String s = "";
        try(
                Scanner input = new Scanner(file);
                ){
            while(input.hasNext()){
                s += "\n" + input.nextLine();
            }
            try(
                    PrintWriter output = new PrintWriter(file);
                    ){
                s ="package " +  s1[s1.length - 1] + ";\n" + s;
                output.println(s);
            }
        }

    }
}
