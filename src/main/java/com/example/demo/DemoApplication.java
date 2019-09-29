package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;

@SpringBootApplication
@RestController
public class DemoApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //注册多个Interceptor  注意路径的写法
//        registry.addInterceptor(new Intercepter1()).addPathPatterns("/api/**");
//        //注册某个拦截器的时候，同时排除某些不拦截的路径
//        //registry.addInterceptor(new TwoIntercepter()).addPathPatterns("/api2/*/**").excludePathPatterns("/api2/xxx/**");
//        WebMvcConfigurer.super.addInterceptors(registry);
//    }

    @GetMapping("/api")
    public Map test(AuthInfo authInfo){
        return null;
    }
}
