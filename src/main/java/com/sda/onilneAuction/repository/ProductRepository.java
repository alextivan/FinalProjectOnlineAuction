package com.sda.onilneAuction.repository;

import com.sda.onilneAuction.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
