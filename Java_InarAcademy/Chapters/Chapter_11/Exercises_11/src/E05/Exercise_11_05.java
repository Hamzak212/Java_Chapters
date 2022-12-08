package E05;
import java.util.*;
public class Exercise_11_05 {
    public static void main(String[] args) {
     Course c1 = new Course("Math");
        c1.addStudent("Hamza KOrkmaz");
        c1.addStudent("Yakub Isko");
        c1.addStudent("Ishak Korkar");
        c1.addStudent("Halit kork");
        String[] students = c1.getStudents();

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }

        System.out.println();

        c1.dropStudent("Hamza KOrkmaz");
        c1.dropStudent("Ishak Korkar");

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
