package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;
    private Address address;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalSalary() {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.getSalary();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public Address getAddress() {
        return address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
