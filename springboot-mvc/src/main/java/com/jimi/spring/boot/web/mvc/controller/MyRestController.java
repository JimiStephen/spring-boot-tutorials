package com.jimi.spring.boot.web.mvc.controller;

import com.jimi.spring.boot.web.mvc.entity.Customer;
import com.jimi.spring.boot.web.mvc.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class MyRestController {
    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
        // TODO
        return new User();
    }

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    List<Customer> getUserCustomers(@PathVariable Long user) {
        // TODO
        return new ArrayList<Customer>();
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
        // TODO
        return new User();
    }
}