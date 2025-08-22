public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        System.out.println("Employee's salary: $" + employee.getSalary());

        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
        System.out.println("HR Manager's salary: $" + hrManager.getSalary());
    }
}

class Employee {

    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {

    @Override
    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee.");
    }
}

