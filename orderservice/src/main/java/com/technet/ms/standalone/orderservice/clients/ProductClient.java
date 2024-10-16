package com.technet.ms.standalone.orderservice.clients;
import org.springframework.web.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class ProductClient {
    @Value("${productservice.api.baseurl}")
    private String productSvcBaseURL;

    public ProductDTO getProductById(Long id) {
        System.out.println(" IN GET PRODUCT BY ID - BASE URL :" + productSvcBaseURL);
        /*
         * Initially I was trying to pass the base URL as uri by appending parameters 
         * That did not work. After referring to the below URL I started using correct way
         * https://dev.to/noelopez/new-restclient-in-spring-61-10ac
         * 
         */
        RestClient restClient = RestClient.builder()
                                        .baseUrl(productSvcBaseURL)
                                        .build();
        System.out.println("REST Client :" + restClient.toString());
        ProductDTO product = restClient.get()
                                       .uri("/products/{id}",id)
                                       .retrieve()
                                       .body(ProductDTO.class);
        return product;
    }

    /* Sample of how not to use RestClient */
    // public ProductDTO getProductByIdOld(Long id) {
    //     System.out.println(" IN GET PRODUCT BY ID - BASE URL :" + productSvcBaseURL);
    //     System.out.println("REST Client :" + restClient);
        
    //     ProductDTO product = restClient.get()
    //                                    .uri("http://productservice:8081/products/{id}",id)
    //                                    .retrieve()
    //                                    .body(ProductDTO.class);
    //     return product;
    // }


}
