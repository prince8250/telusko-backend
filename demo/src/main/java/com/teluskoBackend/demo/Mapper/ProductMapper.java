package com.teluskoBackend.demo.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.teluskoBackend.demo.DTOs.RequestDTOs.CreateProductDTO;
import com.teluskoBackend.demo.DTOs.RequestDTOs.UpdateProductDTO;
import com.teluskoBackend.demo.DTOs.ResponseDTOs.ProductResponseDTO;
import com.teluskoBackend.demo.Model.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<ProductResponseDTO> toDTO(List<Product> products);
    
    ProductResponseDTO toDTO(Product product);

    Product toEntity(CreateProductDTO createProductDTO);

    Product toEntity(UpdateProductDTO updateDTO);

    void UpdateProductFromDTO (UpdateProductDTO updateDTO, @MappingTarget Product product);
    
}
