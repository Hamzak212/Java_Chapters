package Practice;

import java.util.Scanner;
public class TestPuppy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Names: ");
        int count = 0;

        while(count <= 5) {
            count++;
            Puppy Doggies = new Puppy(input.next());

            System.out.println("User " + count + " Is " + Puppy.name + " and length is " + Puppy.Length);
        }
    }
}
class Puppy{
    static String name;
    static Double Length;

    Puppy(String UserName){
        name = UserName;
    }
    public static Double getLength(){
      return Puppy.Length;
    }


}