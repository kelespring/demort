package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;
@Configuration
public class AppWebMvcConfigurationSupport extends WebMvcConfigurationSupport {
    /**
     * Controller 方法参数注入
     * @param argumentResolvers
     */
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new TestDiyRequestParamResolver());
    }

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(new Intercepter1())
                .addPathPatterns("/**");
    }
}
