package com.wurui.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wurui on 2018-12-30.
 */
@Component
@Scope("prototype")
public class DemoPrototypeService {
}
