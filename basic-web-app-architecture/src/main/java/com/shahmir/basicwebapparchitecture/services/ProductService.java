package com.shahmir.basicwebapparchitecture.services;

import com.shahmir.basicwebapparchitecture.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> GetAllProducts();

    Product GetProductById(long id);

    void CreateProduct(Product prod);
}
