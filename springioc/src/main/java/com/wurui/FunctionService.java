package com.wurui;

import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2018-12-25.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " +  word + " !";
    }
}
