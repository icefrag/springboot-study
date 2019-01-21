package com.wurui.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2018-12-25.
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        DemoPrototypeService service = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService service2 = context.getBean(DemoPrototypeService.class);

        System.out.println(service == service2);
    }
}
