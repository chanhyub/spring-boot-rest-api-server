package com.example.springbootrestapiserver.repository;

import com.example.springbootrestapiserver.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>{
}
