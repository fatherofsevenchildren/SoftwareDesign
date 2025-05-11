package com.example.Patterns.service;

import com.example.Patterns.domain.Apple;
import com.example.Patterns.domain.Orange;

public interface FruitFactory {

    Apple createApple();

    Orange createOrange();
}
