package com.wurui.aop;

import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2018-12-27.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("addddddddd");
    };

    @Action(name="mmmmmmmmmmmmmmmmmmm")
    public void mmm(){
        System.out.println("mmmmmmmmmmmm");
    }
}
