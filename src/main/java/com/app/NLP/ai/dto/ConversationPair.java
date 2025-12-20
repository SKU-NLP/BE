package com.app.NLP.ai.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// 대화 시나리오의 발화 쌍 DTO 입니다.
public class ConversationPair {
    private String user;
    private String assistant;
}
