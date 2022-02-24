package com.yunsproject.admin.simpleOrderApi.web.products;

import com.yunsproject.admin.simpleOrderApi.service.ProductService;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductsApiController {

    private final ProductService productService;

    @GetMapping("/api/menu/{id}")
    public ProductResponseDto findById(@PathVariable Long id){
        return productService.findById(id);
    }

    @GetMapping("api/menu")
    public List<ProductResponseDto> findAll(){
        return productService.findAll();
    }
}
