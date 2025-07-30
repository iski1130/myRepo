package lesson_9;

public class Main {

    public static void main(String[] args) {
        int ageArgument = 40;
        employee[] employeeArray = new employee[5];
        employeeArray[0] = new employee("Ason","chairman","ason@mail.com","+123456789",1000,41);
        employeeArray[1] = new employee("Mason","manager","mason@mail.com","+7735357839",2000,30);
        employeeArray[2] = new employee("Jason","commerce","jason@mail.com","+1456789",4000,45);
        employeeArray[3] = new employee("Cason","trader","cason@mail.com","+43354378",1000,30);
        employeeArray[4] = new employee("Dason","postman","dason@mail.com","+3936543",6000,60);

        for (employee index : employeeArray){
            if(index.getAge()>ageArgument){
                index.showInfo();
            }
        }

    }

}
