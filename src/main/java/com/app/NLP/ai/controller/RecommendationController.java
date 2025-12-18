package com.app.NLP.ai.controller;

import com.app.NLP.ai.dto.ChatRequest;
import com.app.NLP.ai.dto.ChatResponse;
import com.app.NLP.ai.service.AiRecommendationService;
import com.app.NLP.global.exception.Success;
import com.app.NLP.global.template.RspTemplate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recommend")
@Tag(name = "AI Recommendation API", description = "AI 기반 대학/학과 추천 API")
@CrossOrigin(origins = "*")
public class RecommendationController {

    private final AiRecommendationService aiRecommendationService;

    @PostMapping
    @Operation(method = "POST", description = "사용자 질문을 받아 AI 기반 학과를 추천합니다.")
    public RspTemplate<ChatResponse> getRecommendation(@RequestBody ChatRequest request) {
        ChatResponse response = aiRecommendationService.getRecommendation(request);
        return RspTemplate.success(Success.OK, response);
    }
}
