package com.yunsproject.admin.simpleOrderApi.domain.products;

import com.yunsproject.admin.simpleOrderApi.domain.BaseTimeEntity;
import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private int stock;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @ManyToMany
    private List<Orders> orders;

    @Builder
    public Products(String name, String description, String price, int stock, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

}
