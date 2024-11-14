package org.example.lab7.task4;

import java.time.LocalDate;
import java.util.List;

public class SalesReport {

            // full
    public void generateReport(List<Sale> sales) {
        System.out.println("Full Sales Report:");

        int[] count = {0};
        double[] totalRevenue = {0.0};
                sales.forEach(sale -> {
                    totalRevenue[0] += sale.getRevenue();
                    count[0]++;
                });
        System.out.println("Total Revenue: " + totalRevenue[0]);
        double avgRevenue = totalRevenue[0] / count[0];
        System.out.println("Average Revenue: " + avgRevenue);

    }
            // by category
    public void generateReport(List<Sale> sales, String productCategory) {
        System.out.println("Sales Report for Category: " + productCategory);

        int[] count = {0};
        double[] totalRevenue = {0.0};
        sales.stream()
                .filter(sale -> sale.getProductCategory().equalsIgnoreCase(productCategory))
                .forEach(sale -> {
                            totalRevenue[0] += sale.getRevenue();
                            count[0]++;});

        System.out.println("Total Revenue: " + totalRevenue[0]);
        double avgRevenue = totalRevenue[0] / count[0];
        System.out.println("Average Revenue: " + avgRevenue);
    }

            // by date range
    public void generateReport(List<Sale> sales, LocalDate startDate, LocalDate endDate) {
        System.out.println("Sales Report from " + startDate + " to " + endDate);
        int[] count = {0};
        double[] totalRevenue = {0.0};
        sales.stream()
                .filter(sale -> sale.getSaleDate().isAfter(startDate) && sale.getSaleDate().isBefore(endDate))
                .forEach(sale -> {
                    totalRevenue[0] += sale.getRevenue();
                    count[0]++;});

        System.out.println("Total Revenue: " + totalRevenue[0]);
        double avgRevenue = totalRevenue[0] / count[0];
        System.out.println("Average Revenue: " + avgRevenue);
    }
}
