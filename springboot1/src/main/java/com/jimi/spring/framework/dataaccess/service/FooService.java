package com.jimi.spring.framework.dataaccess.service;

import com.jimi.spring.framework.dataaccess.domain.Foo;

public interface FooService {
    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);
}