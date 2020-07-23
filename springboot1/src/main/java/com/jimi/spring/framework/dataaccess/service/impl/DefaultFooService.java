package com.jimi.spring.framework.dataaccess.service.impl;

import com.jimi.spring.framework.dataaccess.domain.Foo;
import com.jimi.spring.framework.dataaccess.service.FooService;

public class DefaultFooService implements FooService {
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }
}