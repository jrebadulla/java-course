package Exercise;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary;
    }

}

class Manager extends Employee {

    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;

    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }

}

public class Exercise {
    public static void main(String[] args) {

        Employee employee = new Employee("Alice", 50000);

        Manager manager = new Manager("Bob", 80000, "IT");

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());

    }
}
