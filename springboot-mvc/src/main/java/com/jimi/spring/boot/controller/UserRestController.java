package com.jimi.spring.boot.controller;

import com.jimi.spring.boot.model.Customer;
import com.jimi.spring.boot.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserRestController {

    @RequestMapping(value = "/{user}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long user) {
// ...
        return null;
    }

    @RequestMapping(value = "/{user}/customers", method = RequestMethod.GET)
    List<Customer> getUserCustomers(@PathVariable Long user) {
// ...
        return null;
    }

    @RequestMapping(value = "/{user}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long user) {
// ...
        return null;
    }
}