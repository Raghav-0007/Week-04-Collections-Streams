package mapinterface.groupobjects;

import java.util.*;

public class GroupEmployees {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Example employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Print result
        groupedEmployees.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
    }
}