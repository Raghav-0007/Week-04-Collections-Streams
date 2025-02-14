package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private String id;
    private String name;
    private String department;
    private double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public void getEmployeeDetails(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("salary: "+salary);
    }
}
