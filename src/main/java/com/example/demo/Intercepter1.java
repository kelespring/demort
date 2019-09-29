package com.example.demo;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Intercepter1 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("--------------->");
        AuthInfo authInfo = new AuthInfo();
        authInfo.setName("---->");
        request.setAttribute("user",authInfo);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
