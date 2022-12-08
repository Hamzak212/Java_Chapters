package E02;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office,
                 double salary, String hiredDate, String title){
        super(name, address, phoneNumber, email, office, salary, hiredDate);
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String toString() {
        return "Class = Staff\nName = " + getName() + "\n";
    }
}
