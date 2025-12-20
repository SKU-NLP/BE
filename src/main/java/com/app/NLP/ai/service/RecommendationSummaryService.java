package com.app.NLP.ai.service;

import com.app.NLP.ai.dto.RecommendationSummaryRequest;
import com.app.NLP.ai.dto.RecommendationSummaryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class RecommendationSummaryService {

    private final WebClient webClient;

    public RecommendationSummaryResponse getRecommendationSummary(RecommendationSummaryRequest request) {
        return webClient.post()
                .uri("/recommendation/summary")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(RecommendationSummaryResponse.class)
                .block();
    }
}
