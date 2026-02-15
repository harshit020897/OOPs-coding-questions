package OOPsCodingTest;

public class SalaryCalculation {
    public static void main(String[] args) {
        Employee e1 = new Manager(60000, 10000);
        Employee e2 = new Developer(50, 160);

        System.out.println("Manager Salary: " + e1.calculateSalary());
        System.out.println("Developer Salary: " + e2.calculateSalary());
    }
}

class Employee{
    public double calculateSalary()
    {
        return 0.0;
    }
}

class Manager extends Employee{
    private double baseSalary;
    private double bonus;

    public Manager(double base, double bonus) {
        this.baseSalary = base;
        this.bonus = bonus;
    }
        @Override
                public double calculateSalary()
        {
            return baseSalary + bonus;
        }


}

class Developer extends Employee{
    private double hourlyRate;
    private double hours;

    public Developer(double hourlyRate, double hours)
    {
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double calculateSalary()
    {
        return (hourlyRate*hours);
    }
}