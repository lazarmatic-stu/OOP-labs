package org.example.lab7.task3;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public record EmployeeRecord(String name, String position, double salary, LocalDate employmentDate){
    public static EmployeeRecord createIntern(String name){
        return new EmployeeRecord(name , "Intern" , 1200 , LocalDate.of(2015,6,15));
    }
    public static List<EmployeeRecord> filterEmployeeByYearsOfWork(List<EmployeeRecord> employees , int years){
        LocalDate currentDate = LocalDate.now();
        List<EmployeeRecord> filteredEmployees = new ArrayList<>();
        employees.stream()
                .filter(employee -> Period.between(employee.employmentDate(), currentDate).getYears() > years)
                .forEach(filteredEmployees::add);
        return filteredEmployees;
    }
    public static double calculateAverageSalaryByPosition(List<EmployeeRecord> employees , String position){
        double totalSalary = 0.0;
        int count = 0;
        for (EmployeeRecord employee : employees){
            if (employee.position.equalsIgnoreCase(position)){
                totalSalary += employee.salary;
                count++;
            }
        }
        return totalSalary / count;
    }
    public static List<EmployeeRecord> findEmployeesByPosition(List<EmployeeRecord> employees , String position){
        List<EmployeeRecord> filteredEmployees = new ArrayList<>();
        employees.stream()
                .filter(employee -> employee.position.equalsIgnoreCase(position))
                .forEach(filteredEmployees::add);
        return filteredEmployees;
    }
}
