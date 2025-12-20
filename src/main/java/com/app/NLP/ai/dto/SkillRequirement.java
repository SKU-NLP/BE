package com.app.NLP.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 직무/전공 요구 역량 차트용 DTO입니다.
public class SkillRequirement {
    private String skill;
    private Integer importance;
}
