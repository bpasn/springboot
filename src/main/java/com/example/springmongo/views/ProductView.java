package com.example.springmongo.views;

import com.example.springmongo.controller.ProductController;
import com.example.springmongo.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "api/v2/product")
public class ProductView {

}
