package com._paradigms.jobapp.review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
}
