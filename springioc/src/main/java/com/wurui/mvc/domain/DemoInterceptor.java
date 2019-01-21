package com.wurui.mvc.domain;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wurui on 2019-01-15.
 */
public class DemoInterceptor  extends HandlerInterceptorAdapter{
    // 请求处理前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime =  System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    // 请求处理完后
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long)request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println("本次请求处理时间为:" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handling time",endTime - startTime);
    }
}
