package com.example.Patterns.service;

import com.example.Patterns.domain.Fruit;
import com.example.Patterns.emum.FruitType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FruitFactoryImpl implements FruitFactory {

    private final AppleFactory appleFactory;
    private final OrangeFactory orangeFactory;


    @Override
    public Fruit create(FruitType fruitType) {
        return switch (fruitType) {
            case APPLE -> appleFactory.create();
            case ORANGE -> orangeFactory.create();
        };
    }
}
