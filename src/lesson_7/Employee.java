package lesson_7;

public class Employee {

    private String name, position, email, phoneNumber;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
