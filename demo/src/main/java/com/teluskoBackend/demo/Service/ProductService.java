package com.teluskoBackend.demo.Service;

import java.util.List;

import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;


public interface ProductService {

    List<ProductResponseDTO> getAllProducts();

}
