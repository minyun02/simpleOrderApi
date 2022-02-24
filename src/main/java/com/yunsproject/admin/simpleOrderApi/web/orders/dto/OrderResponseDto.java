package com.yunsproject.admin.simpleOrderApi.web.orders.dto;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class OrderResponseDto {

    private List<Products> products;
    private String totalPrice;
    private String customerRequest;
    private String status;
    private LocalDateTime orderedDate;
    private LocalDateTime acceptedDate;
    private LocalDateTime canceledDate;
    private LocalDateTime doneCookingDate;
    private LocalDateTime deliveryStartedDate;
    private LocalDateTime deliveryEndedDate;

    public OrderResponseDto(Orders entity) {
        this.products = entity.getProducts();
        this.totalPrice = entity.getTotalPrice();
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
