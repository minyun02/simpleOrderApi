package com.yunsproject.admin.simpleOrderApi.domain.products;

import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Products, Long> {

    @Modifying
    @Query(
            value = "update products set stock=stock-?2 where id=?1",
            nativeQuery = true)
    void updateStock(Long productId, int stock);
}
