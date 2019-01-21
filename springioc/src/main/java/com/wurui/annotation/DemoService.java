package com.wurui.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2019-01-13.
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }
}
