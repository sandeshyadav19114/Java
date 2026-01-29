package streamapi.f;

import java.time.LocalDate;

class Employee {
    private int id;
    private String name;
    private int age;
    private String dept;
    private double salary;
    private LocalDate joiningDate;

    public Employee(int id, String name, int age, String dept, double salary, LocalDate joiningDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }
    public LocalDate getJoiningDate() { return joiningDate; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + dept + " | " + salary + " | " + joiningDate;
    }
}