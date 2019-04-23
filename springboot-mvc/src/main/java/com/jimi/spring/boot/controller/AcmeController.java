package com.jimi.spring.boot.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jimiStephen on 2019-04-12.
 */
@Controller
@RequestMapping("/acme/")
public class AcmeController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        int a = 233;
        String testStr = "asdf";
        testStr.charAt(1000);
        return "index";
    }
}
