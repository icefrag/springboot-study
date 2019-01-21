package com.wurui.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wurui on 2018-12-30.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig config = context.getBean(ElConfig.class);

        config.outputResource();

    }
}
