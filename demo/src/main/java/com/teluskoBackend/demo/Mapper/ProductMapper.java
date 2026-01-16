package com.teluskoBackend.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;
import com.teluskoBackend.demo.Model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<ProductResponseDTO> toDTO(List<Product> products);
}
