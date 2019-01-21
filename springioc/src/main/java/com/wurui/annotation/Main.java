package com.wurui.annotation;

import com.wurui.aware.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2019-01-13.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();
    }
}
