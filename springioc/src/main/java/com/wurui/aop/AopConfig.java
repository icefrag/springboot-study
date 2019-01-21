package com.wurui.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wurui on 2018-12-28.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.wurui.aop")
public class AopConfig {
}
