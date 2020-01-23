package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class Intercepter1 implements HandlerInterceptor {

    @Autowired
    private TestService testService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        testService.test();
        System.out.println("------v11.11--------->");
        String realm = request.getHeader("realm");

        AuthInfo authInfo = new AuthInfo();
        authInfo.setName("---->");
        request.setAttribute("user",authInfo);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
