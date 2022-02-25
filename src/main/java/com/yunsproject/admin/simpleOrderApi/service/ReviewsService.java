package com.yunsproject.admin.simpleOrderApi.service;

import com.yunsproject.admin.simpleOrderApi.domain.reviews.ReviewsRepository;
import com.yunsproject.admin.simpleOrderApi.web.reviews.dto.ReviewsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public Long saveReview(ReviewsRequestDto requestDto){
        return reviewsRepository.save(requestDto.toEntity()).getId();
    }
}
