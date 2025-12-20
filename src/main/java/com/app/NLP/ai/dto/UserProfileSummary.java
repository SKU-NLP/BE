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
// 사용자 프로필 및 강점 요약 데이터 DTO입니다.
public class UserProfileSummary {
    private List<String> interests;
    private List<ProfileStrength> strengths;
    private String careerGoal;
    private String region;
    private String gradeLevel;
}
