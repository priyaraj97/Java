package com.example.demo;

import org.springframework.stereotype.Repository;
import com.example.demo.Employees;

@Repository
public class EmployeeDAO {

private static Employees list = new Employees();
static
{
    list.getEmployeeList().add(new Employee(1,"Priya","T","priyaraj@gmail.com"));

    list.getEmployeeList().add(new Employee(2, "raj","p","priyaraj2840@gmail.com"));

    list.getEmployeeList().add(new Employee(3, "gokul","m","samgokul@gmail.com"));
      
}
public Employees getAllEmployees()
{

    return list;
}
    public void
    addEmployee(Employee employee)
{
    list.getEmployeeList()
        .add(employee);
       
}
}
