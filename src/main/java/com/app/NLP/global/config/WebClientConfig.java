package com.app.NLP.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    // Python AI 서버 주소는 설정값으로 주입받아 추후 연동에 대비합니다.
    @Value("${ai.server.url}")
    private String aiServerUrl;

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(aiServerUrl)
                .build();
    }
}
