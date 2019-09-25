package com.jimi.spring.boot.web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import java.util.Map;

@Controller
public class HomeCotroller {
    @RequestMapping("/")
    public ModelAndView home(@RequestParam Map<String,Object> paramMap, ServletRequest request){

        return new ModelAndView("error/504.ftl");
    }
}
