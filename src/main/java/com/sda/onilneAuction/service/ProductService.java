package com.sda.onilneAuction.service;

import com.sda.onilneAuction.dto.ProductDto;
import com.sda.onilneAuction.model.Product;
import com.sda.onilneAuction.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void add(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setStartingPrice(Integer.valueOf(productDto.getStartBiddingPrice()));
        //product.setCategory();
        product.setEndDateTime(LocalDateTime.parse(productDto.getEndDateTime()));
        productRepository.save(product);
    }
}
