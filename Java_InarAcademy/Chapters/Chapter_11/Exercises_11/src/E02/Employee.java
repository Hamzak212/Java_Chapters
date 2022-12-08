package E02;

public class Employee extends Person{
    private String office;
    private double salary;
    private String hireDate;

    public Employee(String name, String address, String phoneNumber,
                    String email, String office, double salary, String hireDate){
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public String getOffice(){
        return office;
    }

    public double getSalary(){
        return salary;
    }
    public String getHireDate(){
        return hireDate;
    }
    public String toString() {
        return "Class = Employee\nName = " + getName() + "\n";
    }
}
