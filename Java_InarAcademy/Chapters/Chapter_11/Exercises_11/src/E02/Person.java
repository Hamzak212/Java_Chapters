package E02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return ("Class = PERSON" + "\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber + "\nEmail: " + email);
    }
}
