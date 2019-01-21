package com.wurui.aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * Created by wurui on 2018-12-30.
 */
@Component("abcd")
public class DemoService implements BeanNameAware{
    private String name;
    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
