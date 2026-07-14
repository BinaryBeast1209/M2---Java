class Employee {

    int employeeId;
    String employeeName;
    float salary;

    
    Employee() {
        System.out.println("Employee Object Created");

        employeeId = 101;
        employeeName = "Aashish";
        salary = 5000.0f;
    }

    
    void showEmployee() {
        System.out.println("ID      : " + employeeId);
        System.out.println("Name    : " + employeeName);
        System.out.println("Salary  : " + salary);
        System.out.println("----------------------");
    }
}

public class Main {

    public static void main(String[] args) {

        Employee firstEmployee = new Employee();
        Employee secondEmployee = new Employee();
        Employee thirdEmployee = new Employee();

        firstEmployee.showEmployee();
        secondEmployee.showEmployee();
        thirdEmployee.showEmployee();
    }
}
