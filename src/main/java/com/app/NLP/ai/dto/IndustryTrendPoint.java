package com.app.NLP.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 산업 트렌드 차트에 필요한 연도별 지표 DTO입니다.
public class IndustryTrendPoint {
    private String year;
    private Integer demand;
    private Integer salary;
}
