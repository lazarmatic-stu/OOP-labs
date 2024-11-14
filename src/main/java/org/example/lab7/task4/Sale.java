package org.example.lab7.task4;

import java.time.LocalDate;

public class Sale {
    private String productCategory;
    private double revenue;
    private LocalDate saleDate;

    public Sale(String productCategory, double revenue, LocalDate saleDate) {
        this.productCategory = productCategory;
        this.revenue = revenue;
        this.saleDate = saleDate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public double getRevenue() {
        return revenue;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Sale{" + "productCategory= " + productCategory + " , revenue=" + revenue +
                ", saleDate=" + saleDate + '}';
    }
}
