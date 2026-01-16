package com.teluskoBackend.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teluskoBackend.demo.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
