package com.yunsproject.admin.simpleOrderApi.service;

import com.yunsproject.admin.simpleOrderApi.domain.products.ProductRepository;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional
    public ProductResponseDto findById(Long id){
        Products entity = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 메뉴를 찾을 수 없습니다."+id));
        return new ProductResponseDto(entity);
    }

    @Transactional
    public List<ProductResponseDto> findAll(){
        return productRepository.findAll().stream().map(ProductResponseDto::new).collect(Collectors.toList());
    }
}
