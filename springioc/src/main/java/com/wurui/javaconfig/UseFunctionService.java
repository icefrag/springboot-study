package com.wurui.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2018-12-25.
 */
public class UseFunctionService {
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
}
