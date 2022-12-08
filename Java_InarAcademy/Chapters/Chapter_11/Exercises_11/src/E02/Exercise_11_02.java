package E02;
import java.nio.file.attribute.FileAttributeView;
import java.util.*;
public class Exercise_11_02 {
    public static void main(String[] args) {
        Person person = new Person("Hamza Korkmaz", "111 Rock Road, Wayne NJ",
                "201,699,4354", "Hamzakorkmaz34@gmail.com");
        Student student = new Student("Lincoln", "34 Mary road","201,543,654",
                "Lincoln23@gmail.com",2);
        Employee employee = new Employee("Larry","98 Carol Street", "201,432,6544",
                "larry@gmail.com","Office 2",2500.0, "November 21");
        Faculty faculty = new Faculty("Micheal","99 long way road", "201,432,4364",
                "micheal@gmail.com","Office 34", 3500.0,"December 23","5-6PM","Captain");
        Staff staff = new Staff("Lara","79 Manta Road", "973,432,6547",
                "lara@gmail.com","Office 69",9900.0,"December 2","Captain To the Captian");


        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);


    }
}
