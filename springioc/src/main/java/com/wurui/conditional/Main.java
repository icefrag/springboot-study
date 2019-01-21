package com.wurui.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Condition;

/**
 * Created by wurui on 2019-01-01.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);


        ListService service = context.getBean(ListService.class);

        System.out.println(service.showListCmd());
    }

}
