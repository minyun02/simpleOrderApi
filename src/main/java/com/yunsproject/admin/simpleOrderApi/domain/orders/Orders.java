package com.yunsproject.admin.simpleOrderApi.domain.orders;

import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.web.orders.dto.OrderRequestDto;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "ORDERS_PRODUCTS",
            joinColumns = @JoinColumn(name = "ORDER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID")
    )
    private List<Products> products = new ArrayList<>();

    @Column(nullable = false)
    private String totalPrice;

    private String customerRequest;

    @Column(nullable = false)
    private String status;

    @CreatedDate
    private LocalDateTime orderedDate;

    private LocalDateTime acceptedDate;

    private LocalDateTime canceledDate;

    private LocalDateTime doneCookingDate;

    private LocalDateTime deliveryStartedDate;

    private LocalDateTime deliveryEndedDate;

    @Builder
    public Orders(List<Products> products, String totalPrice, String customerRequest,
                  String status, LocalDateTime orderedDate, LocalDateTime acceptedDate,
                  LocalDateTime canceledDate, LocalDateTime doneCookingDate, LocalDateTime deliveryStartedDate, LocalDateTime deliveryEndedDate) {
        this.products = products;
        this.totalPrice = totalPrice;
        this.customerRequest = customerRequest;
        this.status = status;
        this.orderedDate = orderedDate;
        this.acceptedDate = acceptedDate;
        this.canceledDate = canceledDate;
        this.doneCookingDate = doneCookingDate;
        this.deliveryStartedDate = deliveryStartedDate;
        this.deliveryEndedDate = deliveryEndedDate;
    }

}
