package com.example.Patterns.examle;

import com.example.Patterns.emum.FruitType;
import com.example.Patterns.service.FruitFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ExampleCommandLineRunner implements CommandLineRunner {

    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) throws Exception {
        log.info("apple = {}", fruitFactory.create(FruitType.APPLE));
    }
}
