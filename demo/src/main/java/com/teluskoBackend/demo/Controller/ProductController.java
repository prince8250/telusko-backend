package com.teluskoBackend.demo.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teluskoBackend.demo.DTOs.RequestDTOs.CreateProductDTO;
import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;
import com.teluskoBackend.demo.Service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts(){
        return ResponseEntity.ok().body(service.getAllProducts());
    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<ProductResponseDTO> getById(@PathVariable Integer prodId){
        return ResponseEntity.ok().body(service.getById(prodId));
    }

    @PostMapping("/products/save")
    public ResponseEntity<Void> addProduct(@RequestBody CreateProductDTO createProductDTO){
        service.addProduct(createProductDTO);
        return ResponseEntity.ok().build();
    }
}
