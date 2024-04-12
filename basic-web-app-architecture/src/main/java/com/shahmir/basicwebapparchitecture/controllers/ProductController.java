package com.shahmir.basicwebapparchitecture.controllers;

import com.shahmir.basicwebapparchitecture.handlers.ResponseHandler;
import com.shahmir.basicwebapparchitecture.models.Product;
import com.shahmir.basicwebapparchitecture.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/products")
    public ResponseEntity<Object> createProduct(@RequestBody Product product){
        productService.CreateProduct(product);
        return ResponseHandler.CreateResponse("Product created successfully!",product, HttpStatus.OK);
    }

    @GetMapping("/products")
    public  ResponseEntity<Object> fetchAllProducts(){
        List<Product> products = productService.GetAllProducts();
        return ResponseHandler.CreateResponse("Products Fetched Successfully", products,HttpStatus.OK);
    }

    @GetMapping(path = "/products/{id}")
    public ResponseEntity<Object> fetchProductById(@PathVariable long id){
        Product prod = productService.GetProductById(id);
        return ResponseHandler.CreateResponse("Product found!",prod,HttpStatus.OK);
    }



}
