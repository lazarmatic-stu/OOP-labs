package org.example.lab7.task3;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<EmployeeRecord> employees = List.of( new EmployeeRecord("Lazar", "Senior Developer", 80000.00, LocalDate.of(2015, 6, 15)),
                new EmployeeRecord("Milan", "Junior Developer", 55000.00, LocalDate.of(2020, 1, 20)),
                new EmployeeRecord("Marko", "Senior Developer", 85000.00, LocalDate.of(2014, 3, 5)),
                new EmployeeRecord("Nikola", "Product Manager", 95000.00, LocalDate.of(2010, 8, 30)),
                new EmployeeRecord("Jovana", "Intern", 30000.00, LocalDate.of(2023, 9, 1)),
                new EmployeeRecord("Marija", "Senior Developer", 90000.00, LocalDate.of(2016, 11, 11)),
                EmployeeRecord.createIntern("Stefan")
        );

        List<EmployeeRecord> yearEmployees = EmployeeRecord.filterEmployeeByYearsOfWork(employees , 2);
        for (EmployeeRecord employee : yearEmployees)
            System.out.println(employee);

        System.out.println("");

        List<EmployeeRecord> positionEmployees = EmployeeRecord.findEmployeesByPosition(employees , "Senior Developer");
        for (EmployeeRecord employee : positionEmployees)
            System.out.println(employee);

        System.out.println("");

        System.out.println(EmployeeRecord.calculateAverageSalaryByPosition(employees , "Senior Developer"));

    }
}
