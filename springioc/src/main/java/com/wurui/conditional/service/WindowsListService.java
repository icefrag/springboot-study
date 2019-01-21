package com.wurui.conditional.service;

import com.wurui.conditional.ListService;
import com.wurui.conditional.condition.WindowsCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;

/**
 * Created by wurui on 2019-01-01.
 */
@Service
@Conditional(WindowsCondition.class)
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
