package com.example.simpleweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RunApplication implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    @Autowired
    public RunApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        int count = 1;
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(count++ + ". " +beanName);
        }
    }
}
