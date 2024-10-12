package com.technet.ms.standalone.productservice.repo;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.technet.ms.standalone.productservice.model.Product;

//import com.technet.ms.standalone.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}