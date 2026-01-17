package com.teluskoBackend.demo.Service;

import java.util.List;

import com.teluskoBackend.demo.DTOs.RequestDTOs.CreateProductDTO;
import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;


public interface ProductService {

    List<ProductResponseDTO> getAllProducts();

    ProductResponseDTO getById(Integer prodId);

    void addProduct(CreateProductDTO createProductDTO);
}
