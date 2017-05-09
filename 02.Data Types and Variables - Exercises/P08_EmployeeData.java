import java.util.Scanner;

/**
 * Created by todor on 9.05.2017 г..
 */
public class P08_EmployeeData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        employee newEmployee = new employee();
        newEmployee.setFirstName(scan.nextLine());
        newEmployee.setLastName(scan.nextLine());
        newEmployee.setAge(Integer.parseInt(scan.nextLine()));
        newEmployee.setGender(scan.nextLine().charAt(0));
        newEmployee.setPersonalIdNumber(Long.parseLong(scan.nextLine()));
        newEmployee.setEmployeeNumber(Integer.parseInt(scan.nextLine()));
        
        newEmployee.printEmployeeData();
    }
}

class employee {
    String firstName;
    String lastName;
    int age;
    char gender;
    long personalIdNumber;
    int employeeNumber;
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public char getGender() {
        return gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    
    public long getPersonalIdNumber() {
        return personalIdNumber;
    }
    
    public void setPersonalIdNumber(long personalIdNumber) {
        this.personalIdNumber = personalIdNumber;
    }
    
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    
    public void printEmployeeData(){
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Personal ID: " + getPersonalIdNumber());
        System.out.println("Unique Employee number: " + getEmployeeNumber());
    }
}