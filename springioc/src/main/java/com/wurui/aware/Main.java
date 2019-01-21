package com.wurui.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2018-12-30.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        DemoService service = context.getBean(DemoService.class);

        System.out.println(service.getName());

        System.out.println(AppilicationContextUtil.applicationContext);

        System.out.println(AppilicationContextUtil.applicationContext == context);
    }
}
