package com.kashif.supermarket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kashif.supermarket.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
