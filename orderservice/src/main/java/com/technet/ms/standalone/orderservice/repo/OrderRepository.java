package com.technet.ms.standalone.orderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technet.ms.standalone.orderservice.entity.ProductOrder;

public interface OrderRepository extends JpaRepository<ProductOrder, Long> {
}
