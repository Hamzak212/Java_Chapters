package E02;

public class Student extends Person{
    private static final int FRESHMAN = 0;
    private static final int SOPHOMORE = 1;
    private static final int JUNIOR = 2;
    private static final int SENIOR = 3;

    private int classStatus;

    public Student(String name, String address, String phoneNumber, String email, int classStatus){
        super(name,address,phoneNumber,email);
        this.classStatus = classStatus;
    }
    public int getClassStatus(){
        return classStatus;
    }
    public String toString(){
        return ("Class = Student\nName = " + getName() + "\n");
    }
}
