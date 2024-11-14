package org.example.lab7.task1;

import java.util.List;

public class DiscountEngine {
    public static DiscountStrategy percentageDiscount = product -> product.getPrice()*0.9;
    public static DiscountStrategy fixedDiscount = product -> product.getPrice() -20;
    public static DiscountStrategy bulkDiscount = product -> {
        if (product.getQuantity() > 5) return product.getPrice() * 0.8;
        else return product.getPrice();
    };
    public static double calculateTotal(List<Product> products , DiscountStrategy discountStrategy){
        double total = 0.0;
        for (Product product : products){
            double discountedPrice = discountStrategy.applyDiscount(product);
            total += discountedPrice * product.getQuantity();
        }
        return total;
    }
}
