package com.wurui.mvc;

import com.wurui.mvc.domain.DemoObj;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wurui on 2019-01-14.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "/getjson")
    public DemoObj getJson(@RequestBody DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }

    @RequestMapping(value = "/getxml")
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
}
