package com.wurui.mvc;

import com.wurui.mvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wurui on 2019-01-17.
 */
@Controller
public class ConverterController {

    @RequestMapping(value="/convert",produces = {"application/x-wurui"})
    @ResponseBody
    public DemoObj conver(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
