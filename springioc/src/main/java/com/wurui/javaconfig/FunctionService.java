package com.wurui.javaconfig;

import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2018-12-25.
 */
public class FunctionService {
    public String sayHello(String word){
        return "new -->Hello " +  word + " !";
    }
}
