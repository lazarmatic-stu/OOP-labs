package org.example.lab7.task1;

@FunctionalInterface
public interface DiscountStrategy {
//    double applyDiscount(double price);
double applyDiscount(Product product);
}
