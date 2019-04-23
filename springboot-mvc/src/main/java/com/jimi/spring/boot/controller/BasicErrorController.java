package com.jimi.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jimiStephen on 2019-04-12.
 */
@Controller
@RequestMapping("/base/")
public class BasicErrorController {

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "index";
    }
}
