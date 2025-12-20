package com.app.NLP.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 레이더 차트에 쓰는 과목별 강점 항목 DTO입니다.
public class ProfileStrength {
    private String subject;
    private Integer score;
}
