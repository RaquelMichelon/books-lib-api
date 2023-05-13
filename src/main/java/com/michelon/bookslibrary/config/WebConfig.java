package com.michelon.bookslibrary.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @autor raqueldarellimichelon
 * created on 13/05/23 inside the package - com.michelon.bookslibrary.config
 **/
@Configuration
public class WebConfig {

    @Value("${cors.origins}")
    private String corsOrigins;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedMethods("*").allowedOrigins(corsOrigins);
            }
        };
    }

}


