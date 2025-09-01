public class Two {
    public static void main(String[] args) {
        SeniorManager sm = new SeniorManager("Jane Smith", 120000, "Sales", 15);
        sm.displayDetails();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Manager Department: " + department);
    }
}

class SeniorManager extends Manager {
    int yearsOfExperience;

    SeniorManager(String name, double salary, String department, int yearsOfExperience) {
        super(name, salary, department);
        this.yearsOfExperience = yearsOfExperience;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Senior Manager Years of Experience: " + yearsOfExperience);
    }
}

