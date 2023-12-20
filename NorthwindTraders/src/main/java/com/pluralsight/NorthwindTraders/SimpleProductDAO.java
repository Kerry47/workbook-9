package com.pluralsight.NorthwindTraders;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SimpleProductDAO implements ProductDAO {
    public SimpleProductDAO() {
        products = new ArrayList<>();
        products.add(new Product(2, "Steak", "Meat", 250.00));
        products.add(new Product(4, "Chicken", "Meat", 300.00));
        products.add(new Product(6, "Turkey", "Meat", 500.00));
    }

    private List<Product> products;

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
