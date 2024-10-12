package com.technet.ms.standalone.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technet.ms.standalone.orderservice.clients.ProductClient;
import com.technet.ms.standalone.orderservice.clients.ProductDTO;
import com.technet.ms.standalone.orderservice.entity.ProductOrder;
import com.technet.ms.standalone.orderservice.repo.OrderRepository;


@Service
public class OrderService {
 
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<ProductOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public ProductOrder getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public ProductOrder addOrder(ProductOrder order) {
        ProductDTO product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}