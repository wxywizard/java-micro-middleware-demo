package com.wizard.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author wangxy
 * @Classname TestService
 * @Date 2023/8/21 17:21
 */
@Service
@Slf4j
public class TestService {

    @Bean
    public Consumer<String> billChannel() {
        log.info("billChannel");
        return message -> log.info("消息："+message);
    }

//    @Bean
//    public Supplier<String> billChannelProduce() {
//        return () -> {
//            // 生产消息的逻辑
//            return "Hello, World!";
//        };
//    }

//    @Bean
//    public Consumer<String> billChannel1() {
//        log.info("billChannel1");
//        return message -> log.info("消息："+message);
//    }

}
