package com.example.Patterns.service;

import com.example.Patterns.domain.Apple;
import com.example.Patterns.domain.Orange;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;

    @Override
    public Apple createApple() {
        return appleFactory.create();
    }

    @Override
    public Orange createOrange() {
        return orangeFactory.create();
    }
}
