// Java program to demonstrate difference method overloading and constructor overloading
package methodOverloadingConstructorOverloading;

class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor overloading
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age, double salary) {
        this(name, age);
        this.salary = salary;
    }

    // Method overloading
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class methodOverloadingConstructorOverloading {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 30, 50000.0);
        System.out.println("Employee1 name: " + employee1.getName());
        System.out.println("Employee1 age: " + employee1.getAge());
        System.out.println("Employee1 salary: " + employee1.getSalary());

        Employee employee2 = new Employee("Jane", 25);
        employee2.setSalary(45000.0f);
        System.out.println("Employee2 name: " + employee2.getName());
        System.out.println("Employee2 age: " + employee2.getAge());
        System.out.println("Employee2 salary: " + employee2.getSalary());
    }
}
