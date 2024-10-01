package com.example.springbootrestapiserver.controller;

import com.example.springbootrestapiserver.entity.Product;
import com.example.springbootrestapiserver.entity.Store;
import com.example.springbootrestapiserver.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreRestController {
    private final StoreService storeService;


    @GetMapping("/store")
    public Store getStore() {
        return storeService.getStore(1L);
    }

    @GetMapping("/product")
    public Product getProduct() {
        return storeService.getProduct(1L);
    }

    @GetMapping("/stores")
    public List<Store> getStores() {
        return storeService.getStores();
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return storeService.getProducts();
    }
}
