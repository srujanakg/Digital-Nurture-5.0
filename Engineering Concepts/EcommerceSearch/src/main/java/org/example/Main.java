package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) return products[mid];
            if (compare < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Phone", "Electronics"),
                new Product(3, "Shoes", "Fashion"),
                new Product(4, "Watch", "Accessories")
        };

        Product result1 = linearSearch(products, "Phone");
        if (result1 != null)
            System.out.println("Linear Search: " + result1.productName + " found");

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2 = binarySearch(products, "Phone");
        if (result2 != null)
            System.out.println("Binary Search: " + result2.productName + " found");
    }
}