package com.yunsproject.admin.simpleOrderApi.web.reviews;

import com.yunsproject.admin.simpleOrderApi.service.ReviewsService;
import com.yunsproject.admin.simpleOrderApi.web.reviews.dto.ReviewsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReviewsApiController {

    private final ReviewsService reviewsService;

    @PostMapping("/api/order/{id}/review")
    public Long saveReview(@RequestBody ReviewsRequestDto requestDto){
        return reviewsService.saveReview(requestDto);
    }
}
