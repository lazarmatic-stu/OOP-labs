package org.example.lab7.task1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        // FIRST PART OF THE TASK
//        double price = 55.8;
//        DiscountStrategy percentageDiscount = (double percentage) -> price * (percentage / 100);
//        double result = percentageDiscount.applyDiscount(40);
//        System.out.println("Price of 55.8 with a 20% discount is: " + result );
//
//        DiscountStrategy fixedDiscount = (double discount) -> price - discount;
//        double result2 = fixedDiscount.applyDiscount(15.0);
//        System.out.println("Price of 55.8 with a 20 discount is: " + result2 );
//
//        DiscountStrategy bulkDiscount = (double discount) -> {
//            if (price > 50) return price - discount;
//            else return price;
//        };
//        double result3 = bulkDiscount.applyDiscount(20);
//        System.out.println("Price of 55.8 with a bulk discount is: " + result3);

        List<Product> products = List.of(
                new Product("Laptop", 1000.0, 2),
                new Product("Phone", 500.0, 3),
                new Product("Tablet", 300.0, 12)
        );
        // Test the percentage discount strategy
        double totalPercentageDiscount = DiscountEngine.calculateTotal(products, DiscountEngine.percentageDiscount);
        System.out.println("Total with Percentage Discount: $" + totalPercentageDiscount);

        // Test the fixed discount strategy
        double totalFixedDiscount = DiscountEngine.calculateTotal(products, DiscountEngine.fixedDiscount);
        System.out.println("Total with Fixed Discount: $" + totalFixedDiscount);

        // Test the bulk discount strategy
        double totalBulkDiscount = DiscountEngine.calculateTotal(products, DiscountEngine.bulkDiscount);
        System.out.println("Total with Bulk Discount: $" + totalBulkDiscount);


    }


}
