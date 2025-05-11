package com.example.Patterns.service;

import com.example.Patterns.domain.Apple;
import org.springframework.stereotype.Service;

@Service
public class AppleFactory<T> implements ConcreteAbstractFactory<Apple> {
    @Override
    public Apple create() {
        return new Apple();
    }
}
