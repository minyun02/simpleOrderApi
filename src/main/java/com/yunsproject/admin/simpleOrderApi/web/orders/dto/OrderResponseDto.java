package com.yunsproject.admin.simpleOrderApi.web.orders.dto;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.domain.users.Users;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.*;

@Getter
public class OrderResponseDto {

    private List<ProductResponseDto> products;
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

    public OrderResponseDto(Orders entity, List<ProductResponseDto> productsList) {
        this.products = productsList;
        this.totalPrice = entity.getTotalPrice();
        this.user = entity.getUser();
        this.customerRequest = entity.getCustomerRequest();
        this.status = entity.getStatus();
        this.orderedDate = entity.getOrderedDate();
        this.acceptedDate = entity.getAcceptedDate();
        this.canceledDate = entity.getCanceledDate();
        this.doneCookingDate = entity.getDoneCookingDate();
        this.deliveryStartedDate = entity.getDeliveryStartedDate();
        this.deliveryEndedDate = entity.getDeliveryEndedDate();
    }
}
