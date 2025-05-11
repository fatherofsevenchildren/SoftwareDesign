package com.example.Patterns.service;

import com.example.Patterns.domain.Orange;
import org.springframework.stereotype.Service;

@Service
public class OrangeFactory<T> implements ConcreteAbstractFactory<Orange> {
    @Override
    public Orange create() {
        return new Orange();
    }
}
