package com.pluralsight.NorthwindTraders;

import java.util.List;

public interface ProductDAO {
     void addProduct(Product product);
     List<Product> getAll();
}
