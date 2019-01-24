package com.wurui;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wurui on 2019-01-24.
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)
// 指定属性存在此自动配置才生效.示意如下
// 1.不存在前缀为hello的配置,看matchIfMissing,默认为true.成立
// 2.存在hello为前缀的配置,条件成立
// 3.存在hello为前缀的配置,但是hello.enabled=false 则条件不成立
// 4.存在hello为前缀的 配置,hello.enabled=true条件成立
@ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing = true)
public class HelloServiceAutoConfiguration {
    private final String msg;

    public HelloServiceAutoConfiguration(HelloServiceProperties helloServiceProperties) {
        this.msg = helloServiceProperties.getMsg();
    }

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(msg);
        return helloService;
    }
}
