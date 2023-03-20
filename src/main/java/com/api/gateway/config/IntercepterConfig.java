package com.api.gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.api.gateway.Interceptor.AuthInterceptor;

@Configuration
public class IntercepterConfig implements WebMvcConfigurer{

    @Autowired
    private AuthInterceptor authInterceptor;

    public static final String[] excludeUrls = {"/**/swagger-ui/index.html"};

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(authInterceptor)
        .addPathPatterns("/**")
        .excludePathPatterns(excludeUrls)
        .order(0);
    }
}
