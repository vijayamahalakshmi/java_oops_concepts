// Parent class
class Employee {
    String name;
    
    Employee(String name) {
        this.name = name;
    }

    // Method to be overridden in subclasses
    double calculateSalary() {
        return 0.0;
    }

    // Method Overloading (Compile-time Polymorphism)
    void showDetails() {
        System.out.println("Employee Name: " + name);
    }

    void showDetails(String department) {
        System.out.println("Employee Name: " + name + ", Department: " + department);
    }
}

// Subclass for Full-time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }

    // Overriding calculateSalary method (Runtime Polymorphism)
    
    double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass for Part-time Employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, double rate, int hours) {
        super(name);
        this.hourlyRate = rate;
        this.hoursWorked = hours;
    }

    // Overriding calculateSalary method (Runtime Polymorphism)
    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class to demonstrate polymorphism
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating objects using parent class reference
        Employee emp1 = new FullTimeEmployee("Alice", 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 20, 80);

        // Demonstrating method overriding (runtime polymorphism)
        System.out.println(emp1.name + "'s Salary: $" + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: $" + emp2.calculateSalary());

        // Demonstrating method overloading (compile-time polymorphism)
        emp1.showDetails();
        emp2.showDetails("IT Department");
    }
}
