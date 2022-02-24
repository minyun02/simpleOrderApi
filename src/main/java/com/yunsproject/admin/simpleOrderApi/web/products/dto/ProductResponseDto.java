package com.yunsproject.admin.simpleOrderApi.web.products.dto;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class ProductResponseDto {

    private Long id;
    private String name;
    private String description;
    private String price;
    private int stock;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ProductResponseDto(Products entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.price = entity.getPrice();
        this.stock = entity.getStock();
        this.createdDate = entity.getCreatedDate();
        this.modifiedDate = entity.getModifiedDate();
    }
}
