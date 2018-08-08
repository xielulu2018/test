package com.xll.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lucas on 2018/8/7.
 */

@ControllerAdvice
public class HandleException {
    @ExceptionHandler({ArithmeticException.class})
    public ModelAndView handleException(Exception ex){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("exception",ex);
        System.out.println("Exception:"+ex);
        return modelAndView;
    }
}
