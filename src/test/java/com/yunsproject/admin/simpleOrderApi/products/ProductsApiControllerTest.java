package com.yunsproject.admin.simpleOrderApi.products;

import com.yunsproject.admin.simpleOrderApi.domain.products.ProductRepository;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.service.ProductService;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsApiControllerTest {

    @Autowired
    ProductService productService;

    @Test
    public void productFindById(){
        ProductResponseDto product = productService.findById(1L);
        assertEquals("치즈버거", product.getName());
    }
}
