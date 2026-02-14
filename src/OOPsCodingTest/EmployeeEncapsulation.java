class Employee {

    // Private attributes (Encapsulation)
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeEncapsulation {
    public static void main(String[] args) {

        // Creating Employee object
        Employee emp = new Employee(1, "John Doe", 50000);

        // Displaying details using getters
        System.out.println("Employee ID: " + emp.getId() +
                " Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}