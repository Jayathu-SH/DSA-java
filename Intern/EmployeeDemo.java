abstract class Employee{
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID : " + id + ", Name : " + name);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}



public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Jaye", 10, 50000);
        Employee emp2 = new PartTimeEmployee("Sanka", 11, 1000, 20);

        emp1.displayInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        emp2.displayInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
