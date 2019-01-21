package com.wurui.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2019-01-01.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
        context.registerShutdownHook();
    }
}
