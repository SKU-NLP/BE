package com.app.NLP.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 추천 결과 요약 데이터를 묶어 반환하는 응답 DTO입니다.
public class RecommendationSummaryResponse {
    private List<DepartmentSummary> departments;
    private UserProfileSummary userProfile;
    private List<ConversationPair> initialConversations;
    private List<ConversationPair> afterRecommendationConversations;
    private List<IndustryTrendPoint> industryTrends;
    private List<SkillRequirement> skillRequirements;
}
