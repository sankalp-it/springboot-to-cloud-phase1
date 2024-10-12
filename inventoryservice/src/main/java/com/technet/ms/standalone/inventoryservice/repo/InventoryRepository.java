package com.technet.ms.standalone.inventoryservice.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.technet.ms.standalone.inventoryservice.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}