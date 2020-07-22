package com.jimi.spring.boot.web;

import com.google.common.collect.Lists;
import com.jimi.spring.boot.web.model.Customer;
import com.jimi.spring.boot.web.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class MyRestController {
@RequestMapping(value="/{user}", method= RequestMethod.GET)
public User getUser(@PathVariable Long user) {

    return new User();

}
@RequestMapping(value="/{user}/customers", method=RequestMethod.GET)
List<Customer> getUserCustomers(@PathVariable Long user) {

    return Lists.newArrayList(new Customer());
}
@RequestMapping(value="/{user}", method=RequestMethod.DELETE)
public User deleteUser(@PathVariable Long user) {

    return new User();
}
}