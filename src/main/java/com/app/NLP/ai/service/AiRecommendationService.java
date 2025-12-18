package com.app.NLP.ai.service;

import com.app.NLP.ai.dto.ChatRequest;
import com.app.NLP.ai.dto.ChatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AiRecommendationService {

    private final WebClient webClient;

    public ChatResponse getRecommendation(ChatRequest request) {
        return webClient.post()
                .uri("/chat")
                .bodyValue(request)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();
    }
}
