package com.example.demo;

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Order(222)
public class Intercepter2 implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String realm = request.getHeader("realm");

        System.out.println("2--------------->");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
