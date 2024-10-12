package com.technet.ms.standalone.orderservice.clients;
import org.springframework.web.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductClient {
    private final RestClient restClient;

    public ProductClient() {
        restClient = RestClient.builder()
                               .baseUrl("http://localhost:8081")
                               .build();
    }
    public ProductDTO getProductById(Long id) {
        ProductDTO product = restClient.get()
                                       .uri("/products/{id}",id)
                                       .retrieve()
                                       .body(ProductDTO.class);
        return product;
    }


}
