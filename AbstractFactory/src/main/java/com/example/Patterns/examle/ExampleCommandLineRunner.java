package com.example.Patterns.examle;

import com.example.Patterns.service.FruitFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ExampleCommandLineRunner implements CommandLineRunner {

    private final FruitFactory fruitFactory;

    @Override
    public void run(String... args) throws Exception {
        var apple = fruitFactory.createApple();
        log.info("Apple = {}", apple);
    }
}
