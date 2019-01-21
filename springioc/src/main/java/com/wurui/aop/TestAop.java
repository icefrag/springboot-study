package com.wurui.aop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wurui on 2018-12-30.
 */
@Component
public class TestAop {
    public void say(){
        System.out.println("测试一下拦截规则s");
    }
}
