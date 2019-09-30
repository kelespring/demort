package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        req.setAttribute("hdd","tttt");
        HeaderMapRequestWrapper requestWrapper = new HeaderMapRequestWrapper(req);
        requestWrapper.addHeader("realm","test");
        chain.doFilter(requestWrapper, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
