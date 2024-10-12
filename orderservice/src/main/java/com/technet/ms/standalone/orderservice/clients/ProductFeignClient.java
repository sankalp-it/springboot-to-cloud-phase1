package com.technet.ms.standalone.orderservice.clients;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "product-service")
public interface ProductFeignClient {

    @GetMapping("/products/{id}")
    ProductDTO getProductById(@PathVariable Long id);
}