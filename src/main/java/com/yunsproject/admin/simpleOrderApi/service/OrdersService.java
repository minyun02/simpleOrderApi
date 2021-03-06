package com.yunsproject.admin.simpleOrderApi.service;

import com.yunsproject.admin.simpleOrderApi.domain.orders.Orders;
import com.yunsproject.admin.simpleOrderApi.domain.orders.OrdersRepository;
import com.yunsproject.admin.simpleOrderApi.domain.products.ProductRepository;
import com.yunsproject.admin.simpleOrderApi.domain.products.Products;
import com.yunsproject.admin.simpleOrderApi.web.orders.dto.OrderRequestDto;
import com.yunsproject.admin.simpleOrderApi.web.orders.dto.OrderResponseDto;
import com.yunsproject.admin.simpleOrderApi.web.products.dto.ProductResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    private final ProductRepository productRepository;

    @Transactional
    public Long orderSave(OrderRequestDto requestDto){

        for(int i=0; i<requestDto.getProducts().size(); i++){
            productRepository.updateStock(requestDto.getProducts().get(i).getId(), requestDto.getProducts().get(i).getStock());
        }

        return ordersRepository.save(requestDto.toEntity()).getId();
    }

    public OrderResponseDto findById(Long id){
        Orders entity = ordersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 주문을 찾을 수 없습니다."+id));

        List<ProductResponseDto> productsList = new ArrayList<>();
        for(int i=0; i<entity.getProducts().size() ;i++){
            ProductResponseDto product = new ProductResponseDto(entity.getProducts().get(i));
            productsList.add(product);
        }
        return new OrderResponseDto(entity, productsList);
    }

}
