package lesson_9;

public class employee {
    private String name, position, email, phoneNumber;
    private int age, salary;

    public employee(String name, String position, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
