package E05;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.numberOfStudents = 0;
    }
    public String[] getStudents(){
        return students.toArray(new String[students.size()]);
    }
    public String getName(){
        return name;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    public void dropStudent(String student){
        if(students.contains(student)){
            students.remove(student);
            numberOfStudents--;
        }else{
            System.out.println("Student Doesn't exist!");
        }
    }
}

