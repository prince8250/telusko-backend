package com.teluskoBackend.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Column(name = "prod_id",
        nullable = false
    )
    @Id
    private Integer prodId;

    @Column(name = "prod_name",
        nullable = false
    )
    private String prodName;

    @Column(name = "price",
        nullable = false
    )
    private Double price;
}
