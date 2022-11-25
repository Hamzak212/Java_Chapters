package E09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] tempCopy = new String[students.length * 2];
            System.arraycopy(students, 0 , tempCopy, 0 , students.length);
            students = tempCopy;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public void dropStudent(String student){
        int index = -1;
        for(int i = 0; i < students.length; i++){
            if(student.equals(students[i])){
                index = i;
            }
        }

        if(index >= 0){

            for(int k = index; k < students.length - 1; k++){
                students[k] = students[k + 1];
            }
        }
        numberOfStudents--;
    }
    public void clear(){
        students = new String[100];
        numberOfStudents = 0;
    }
}
