package com.example.springbootrestapiserver.service;

import com.example.springbootrestapiserver.entity.Product;
import com.example.springbootrestapiserver.entity.Store;
import com.example.springbootrestapiserver.repository.ProductRepository;
import com.example.springbootrestapiserver.repository.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class StoreService {
    private final StoreRepository storeRepository;
    private final ProductRepository productRepository;

    public StoreService(StoreRepository storeRepository, ProductRepository productRepository) {
        this.storeRepository = storeRepository;
        this.productRepository = productRepository;
    }

    public Store getStore(Long id) {
        return storeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 상점이 없습니다. id=" + id));
    }

    public Product getProduct(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 상품이 없습니다. id=" + id));
    }

    public List<Store> getStores() {
        return storeRepository.findAll();
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
