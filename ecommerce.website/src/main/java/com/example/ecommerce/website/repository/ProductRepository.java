package com.yourpackage.repository;

import com.yourpackage.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Define custom queries if needed
}
