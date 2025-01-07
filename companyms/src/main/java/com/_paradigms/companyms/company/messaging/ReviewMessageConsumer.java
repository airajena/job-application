package com._paradigms.companyms.company.messaging;


import com._paradigms.companyms.company.CompanyService;
import com._paradigms.companyms.company.dto.ReviewMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class ReviewMessageConsumer {
    private final CompanyService companyService;

    public ReviewMessageConsumer(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RabbitListener(queues = "companyRatingQueue")
    public void consumeMessage(ReviewMessage reviewMessage){
        companyService.updateCompanyRating(reviewMessage);
    }
}

