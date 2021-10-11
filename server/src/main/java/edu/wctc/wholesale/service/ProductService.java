package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Product;

public interface ProductService {
    Product getProduct(int productId);

    Product getProduct(double price);

    Product getProduct(String name);
}
