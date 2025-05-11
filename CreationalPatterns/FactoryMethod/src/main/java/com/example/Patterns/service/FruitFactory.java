package com.example.Patterns.service;

import com.example.Patterns.domain.Fruit;
import com.example.Patterns.emum.FruitType;

public interface FruitFactory {

    Fruit create(FruitType fruitType);
}
