package com.yunsproject.admin.simpleOrderApi.web.orders;

import com.yunsproject.admin.simpleOrderApi.service.OrdersService;
import com.yunsproject.admin.simpleOrderApi.web.orders.dto.OrderRequestDto;
import com.yunsproject.admin.simpleOrderApi.web.orders.dto.OrderResponseDto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class OrderApiController {

    private final OrdersService ordersService;

    @PostMapping("/api/order")
    public Long orderSave(@RequestBody OrderRequestDto requestDto){
        return ordersService.orderSave(requestDto);
    }

    @GetMapping("/api/order/{id}")
    public OrderResponseDto findById(@PathVariable Long id){
        return ordersService.findById(id);
    }
}
