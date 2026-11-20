class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name = " + name );
        System.out.println("Salary = "+ salary);
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
        System.out.println("Department = " + department);
    }
}
public class Detail {
    public static void main(String[] args) {
        Employee e = new Employee("Alam", 95000);
        Manager m = new Manager("Mahmood", 150000, "CS");
        e.displayDetails();
        m.displayDetails();
    }
}
