package com.yunsproject.admin.simpleOrderApi.web.reviews.dto;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.domain.reviews.Reviews;
import com.yunsproject.admin.simpleOrderApi.domain.users.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
public class ReviewsRequestDto {

    private Orders order;

    private String content;

    private int rating;

    private LocalDateTime createdDate;

    @Builder
    public ReviewsRequestDto(Orders order, String content, int rating, LocalDateTime createdDate) {
        this.order = order;
        this.content = content;
        this.rating = rating;
        this.createdDate = createdDate;
    }

    public Reviews toEntity() {
        return Reviews.builder()
                .order(order)
                .content(content)
                .rating(rating)
                .build();
    }
}
