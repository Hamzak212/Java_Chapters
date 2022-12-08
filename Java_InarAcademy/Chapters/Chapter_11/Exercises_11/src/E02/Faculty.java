package E02;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, Double salary,
                   String hiredDate, String officeHours, String rank){
        super(name,address,phoneNumber,email,office,salary,hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    public String getRank(){
        return rank;
    }
    public String getOfficeHours(){
        return officeHours;
    }
    public String toString() {
        return "Class = Faculty\nName = " + getName() + "\n";
    }
}
