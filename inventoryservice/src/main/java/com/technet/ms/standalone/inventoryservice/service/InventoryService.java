package com.technet.ms.standalone.inventoryservice.service;
import com.technet.ms.standalone.inventoryservice.entity.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.technet.ms.standalone.inventoryservice.repo.InventoryRepository;

import java.util.List;
@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryByProductId(Long productId) {
        return inventoryRepository.findById(productId).orElse(null);
    }
    
    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public Inventory updateInventory(Long productId, int quantity) {
        Inventory inventory = inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}