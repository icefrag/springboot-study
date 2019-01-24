package com.wurui;

/**
 * Created by wurui on 2019-01-24.
 */
public class HelloService {
    private String msg;


    public String sayHello(){
        return "Hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
