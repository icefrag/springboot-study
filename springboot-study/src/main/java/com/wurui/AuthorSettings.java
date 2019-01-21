package com.wurui;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by wurui on 2019-01-19.
 */

@Component
@ConfigurationProperties(prefix = "author")
@PropertySource("classpath:my.properties")
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AuthorSettings{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
