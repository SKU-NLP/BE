package com.app.NLP.ai.controller;

import com.app.NLP.ai.dto.ChatRequest;
import com.app.NLP.ai.dto.ChatResponse;
import com.app.NLP.ai.dto.RecommendationSummaryRequest;
import com.app.NLP.ai.dto.RecommendationSummaryResponse;
import com.app.NLP.ai.service.AiRecommendationService;
import com.app.NLP.ai.service.RecommendationSummaryService;
import com.app.NLP.global.exception.Success;
import com.app.NLP.global.template.RspTemplate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/recommend")
@Tag(name = "AI Recommendation API", description = "AI 기반 대학/학과 추천 API")
@CrossOrigin(origins = "*")
@Slf4j
public class RecommendationController {

    private final AiRecommendationService aiRecommendationService;
    private final RecommendationSummaryService recommendationSummaryService;

    @PostMapping
    @Operation(method = "POST", description = "사용자 질문을 받아 AI 기반 학과를 추천합니다.")
    public RspTemplate<?> getRecommendation(@RequestBody ChatRequest request) {
        String question = request.getQuestion() != null ? request.getQuestion() : "";
        if (question.contains("요약")) {
            String sessionId = request.getSessionId();
            if (sessionId == null || sessionId.isBlank()) {
                sessionId = UUID.randomUUID().toString();
            }
            RecommendationSummaryRequest summaryRequest =
                    new RecommendationSummaryRequest(question, sessionId);
            RecommendationSummaryResponse summary =
                    recommendationSummaryService.getRecommendationSummary(summaryRequest);
            return RspTemplate.success(Success.OK, summary);
        }
        ChatResponse response = aiRecommendationService.getRecommendation(request);
        log.info("request dto: {}", request.getQuestion());
        return RspTemplate.success(Success.OK, response);
    }

    // 추천 결과 요약 정보를 제공하는 엔드포인트입니다.
    @PostMapping("/recommendation/summary")
    @Operation(method = "POST", description = "추천 결과 요약 데이터를 제공합니다.")
    public RspTemplate<RecommendationSummaryResponse> getRecommendationSummary(
            @RequestBody RecommendationSummaryRequest request
    ) {
        return RspTemplate.success(Success.OK, recommendationSummaryService.getRecommendationSummary(request));
    }
}
