package com.wurui.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2018-12-25.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService service = (UseFunctionService)context.getBean("useFunctionService");
        System.out.println(service.sayHello("hello spring di"));;
    }
}
