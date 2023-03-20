package com.api.gateway.Interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class AuthInterceptor implements HandlerInterceptor{
    
    @Override
    public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler){
        return true;
    }
}
