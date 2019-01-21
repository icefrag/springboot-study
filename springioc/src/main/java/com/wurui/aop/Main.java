package com.wurui.aop;

import org.aspectj.weaver.ast.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2018-12-28.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        demoAnnotationService.add();
        demoAnnotationService.mmm();

        TestAop aop = context.getBean(TestAop.class);
        aop.say();
    }
}
