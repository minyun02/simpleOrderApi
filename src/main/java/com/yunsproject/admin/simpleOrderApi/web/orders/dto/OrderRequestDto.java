package com.yunsproject.admin.simpleOrderApi.web.orders.dto;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.domain.users.Users;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
public class OrderRequestDto {
    private List<Products> products;
    private String totalPrice;
    private Users user;
    private String customerRequest;
    private String status;
    private LocalDateTime orderedDate;
    private LocalDateTime acceptedDate;
    private LocalDateTime canceledDate;
    private LocalDateTime doneCookingDate;
    private LocalDateTime deliveryStartedDate;
    private LocalDateTime deliveryEndedDate;

    @Builder
    public OrderRequestDto(List<Products> products, String totalPrice, Users user, String customerRequest,
                           String status, LocalDateTime orderedDate, LocalDateTime acceptedDate,
                           LocalDateTime canceledDate, LocalDateTime doneCookingDate, LocalDateTime deliveryStartedDate, LocalDateTime deliveryEndedDate) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.user = user;
        this.customerRequest = customerRequest;
        this.status = status;
        this.orderedDate = orderedDate;
        this.acceptedDate = acceptedDate;
        this.canceledDate = canceledDate;
        this.doneCookingDate = doneCookingDate;
        this.deliveryStartedDate = deliveryStartedDate;
        this.deliveryEndedDate = deliveryEndedDate;
    }

    public Orders toEntity(){
        return Orders.builder()
                .products(products)
                .totalPrice(totalPrice)
                .user(user)
                .customerRequest(customerRequest)
                .status(status)
                .build();
    }
}
