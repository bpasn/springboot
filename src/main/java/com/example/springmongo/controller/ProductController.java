package com.example.springmongo.controller;

import com.example.springmongo.models.Product;
import com.example.springmongo.repository.IProductRepository;
import com.example.springmongo.services.ProductService;
import com.mongodb.MongoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(path = "api/v1/product")
public class ProductController {

    final ProductService productService = new ProductService();

    @Autowired
    private IProductRepository productRepository;
    @GetMapping("/getProduct")
    public @ResponseBody List<Product> getProduct() throws MongoException , Exception {
        return productRepository.findAll();
    }

    @PostMapping("/create")
    public @ResponseBody String createProduct(@RequestBody Product product) throws  MongoException , Exception{
        productRepository.save(product);
        return "Create product successfully";
    }

}
