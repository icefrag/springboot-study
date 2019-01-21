package com.wurui.aop;

import java.lang.annotation.*;

/**
 * Created by wurui on 2018-12-27.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name() default "";
}
