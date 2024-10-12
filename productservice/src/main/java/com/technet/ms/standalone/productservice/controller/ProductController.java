    package com.technet.ms.standalone.productservice.controller;
// package com.technet.ms.standalone.productservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technet.ms.standalone.productservice.model.Product;
import com.technet.ms.standalone.productservice.service.ProductService;

@RestController
//@RequestMapping
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        // System.out.println("Inside Get Products");
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        // System.out.println("Inside Put Products");
        return productService.addProduct(product);
    }
}