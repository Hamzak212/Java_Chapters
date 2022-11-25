package E09;

public class Exercise_10_09 {
    public static void main(String[] args) {

        System.out.println("Adding Three Students => ");
        Course Course1 = new Course("Math");
        Course1.addStudent("Hamza Korkmaz");
        Course1.addStudent("Larry Bird");
        Course1.addStudent("Micheal Jackson\n");
        displayStudents(Course1.getStudents(), Course1.getNumberOfStudents());
        System.out.println("Removing one => ");
        Course1.dropStudent("Micheal Jackson");
        displayStudents(Course1.getStudents(), Course1.getNumberOfStudents());
    }
    public static void displayStudents(String[] students, int number){

        for(int i = 0; i < number; i++){
            System.out.print(students[i] + " ");
        }
        System.out.println();
    }
}
