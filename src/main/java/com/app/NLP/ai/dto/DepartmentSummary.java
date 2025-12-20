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
// 추천 학과 카드에 필요한 요약 정보 DTO입니다.
public class DepartmentSummary {
    private String name;
    private String university;
    private Integer matchScore;
    private Integer employmentRate;
    private Integer averageSalary;
    private Double competitionRate;
    private String requiredGrade;
    private String description;
    private List<String> relatedJobs;
    private String websiteUrl;
}
