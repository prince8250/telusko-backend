package com.teluskoBackend.demo.Service.Implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;
import com.teluskoBackend.demo.Mapper.ProductMapper;
import com.teluskoBackend.demo.Model.Product;
import com.teluskoBackend.demo.Repository.ProductRepo;
import com.teluskoBackend.demo.Service.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepo repo;
    private final ProductMapper mapper;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        List<Product> products = repo.findAll();
        return mapper.toDTO(products);

    }

    
}
