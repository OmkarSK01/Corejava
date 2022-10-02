package Controlflowstatements;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    int empId;
        String empName;
        String empAdd;
        double salary;

public Employee(int empId, String empName, String empAdd, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.salary = salary;
        }

public static void main(String[] args) {
        Employee obj1 = new Employee(1,"Rajkumar","Pune",7674);
        Employee obj2 = new Employee(2,"Rahul","Nashik",766574);
        Employee obj3 = new Employee(3,"Akshay","Nagpur",7674564);

        List<Employee> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        list.forEach(s->{
        System.out.println("id=> "+s.empId+" name=> "+s.empName+" add=> "+s.empAdd+" salary=> "+s.salary);
        });
        }
        }



