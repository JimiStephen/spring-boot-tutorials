package com.jimi.spring.redisdemo.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
@RequestMapping("/template/redis/")
public class RedisTemplateExample {

    // inject the actual template
//    @Autowired
//    private RedisTemplate<String, String> template;

    // inject the template as ListOperations
    @Resource(name = "listOperations")
    private ListOperations<String, String> listOps;

    @ResponseBody
    @RequestMapping(value = "addLink")
    public void addLink() {
        String userId = "jack";
        URL url = null;
        try {
            url = new URL("http://www.baidu.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        listOps.leftPush(userId, url.toExternalForm());
    }
}