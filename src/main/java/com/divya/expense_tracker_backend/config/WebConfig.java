package com.divya.expense_tracker_backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000","https://expense-tracker-frontend-po64-e7pjeplas-divshree96s-projects.vercel.app/")
                .allowedMethods("*")
                .allowedHeaders("*");
    }
}
