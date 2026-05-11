package com.almacenPro.Catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.almacenPro.Catalogo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}