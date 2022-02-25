package com.yunsproject.admin.simpleOrderApi.domain.reviews;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.domain.users.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Orders order;

    private String content;

    private int rating;

    @CreatedDate
    private LocalDateTime createdDate;

    @Builder
    public Reviews(Orders order, String content, int rating, LocalDateTime createdDate) {
        this.order = order;
        this.content = content;
        this.rating = rating;
        this.createdDate = createdDate;
    }
}
