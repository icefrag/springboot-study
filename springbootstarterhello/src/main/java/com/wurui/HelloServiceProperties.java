package com.wurui;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by wurui on 2019-01-24.
 */
@ConfigurationProperties(prefix="hello")
public class HelloServiceProperties {
    private static final String MSG = "world";

    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
