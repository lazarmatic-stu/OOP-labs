package org.example.lab7.task4;

import java.time.LocalDate;
import java.util.List;

public class Main {public static void main(String[] args) {

    List<Sale> sales = List.of(
            new Sale("Food", 250.00, LocalDate.of(2023, 5, 15)),
            new Sale("Cars", 100.00, LocalDate.of(2023, 5, 16)),
            new Sale("Food", 500.00, LocalDate.of(2023, 5, 17)),
            new Sale("Furniture", 300.00, LocalDate.of(2023, 6, 1)),
            new Sale("Cars", 200.00, LocalDate.of(2023, 6, 2)),
            new Sale("Food", 150.00, LocalDate.of(2023, 6, 3)),
            new Sale("Furniture", 450.00, LocalDate.of(2023, 6, 4)),
            new Sale("Food", 600.00, LocalDate.of(2023, 6, 5))
    );

    SalesReport report = new SalesReport();

    report.generateReport(sales);

    report.generateReport(sales, "Food");
    report.generateReport(sales, "Cars");


    LocalDate startDate = LocalDate.of(2023, 5, 15);
    LocalDate endDate = LocalDate.of(2023, 6, 1);
    report.generateReport(sales, startDate, endDate);
}
}
