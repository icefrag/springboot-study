package com.wurui.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wurui on 2019-01-15.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        exception.printStackTrace();
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg","额外信息");
    }

    /**
     * 禁用所有requstmapping的 id属性.
     */
    /*
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }
    */
}
