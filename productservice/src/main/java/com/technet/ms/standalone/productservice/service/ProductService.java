
package com.technet.ms.standalone.productservice.service;
// package com.technet.ms.standalone.productservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technet.ms.standalone.productservice.model.Product;
import com.technet.ms.standalone.productservice.repo.ProductRepository;

@Service
public class ProductService { 
   @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}