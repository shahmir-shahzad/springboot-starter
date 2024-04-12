package com.shahmir.basicwebapparchitecture.services.impl;

import com.shahmir.basicwebapparchitecture.exceptions.NoProductFoundException;
import com.shahmir.basicwebapparchitecture.models.Product;
import com.shahmir.basicwebapparchitecture.repositories.ProductRepo;
import com.shahmir.basicwebapparchitecture.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> GetAllProducts() {
        System.out.println("Finding all products");
        return productRepo.findAll();
    }

    @Override
    public Product GetProductById(long id) {
        return productRepo.findById(id).orElseThrow(()->new NoProductFoundException("Product not available with Id "+id));
    }

    @Override
    public void CreateProduct(Product prod) {
        System.out.println("Creating the product in db: "+ prod);
        productRepo.save(prod);
    }
}
