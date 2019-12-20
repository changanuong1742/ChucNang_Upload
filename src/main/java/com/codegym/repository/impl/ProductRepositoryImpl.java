package com.codegym.repository.impl;

import com.codegym.model.Product;
import com.codegym.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {

    List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "Laptop1", "img1"));
        productList.add(new Product(2, "Laptop2", "img2"));

    }

    @Override
    public List findAll() {
        return productList;
    }

    @Override
    public Product findById(Long id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public Product findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }


}
