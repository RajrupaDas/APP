public class Two {

    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "123 Main St", 90000, "Project Manager");
        Developer developer = new Developer("Bob", "456 Oak Ave", 85000, "Senior Developer");
        Programmer programmer = new Programmer("Charlie", "789 Pine Ln", 75000, "Junior Programmer");

        System.out.println("--- Manager Details ---");
        manager.printDetails();
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProjects();
        System.out.println();

        System.out.println("--- Developer Details ---");
        developer.printDetails();
        developer.calculateBonus();
        developer.generatePerformanceReport();
        System.out.println();

        System.out.println("--- Programmer Details ---");
        programmer.printDetails();
        programmer.calculateBonus();
        programmer.generatePerformanceReport();
    }
}

abstract class BaseEmployee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public BaseEmployee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public abstract void calculateBonus();

    public void generatePerformanceReport() {
        System.out.println("Generating a performance report for " + name);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends BaseEmployee {
    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Bonus for " + name + " is 15% of salary: $" + (salary * 0.15));
    }

    public void manageProjects() {
        System.out.println(name + " is managing project teams.");
    }
}

class Developer extends BaseEmployee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Bonus for " + name + " is 10% of salary: $" + (salary * 0.10));
    }
}

class Programmer extends BaseEmployee {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Bonus for " + name + " is 8% of salary: $" + (salary * 0.08));
    }
}

