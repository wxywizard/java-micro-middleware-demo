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
        return message -> log.info("billChannel消息："+message);
    }

    @Bean
    public Consumer<String> pendingChannel() {
        log.info("pendingChannel");
        return message -> log.info("pendingChannel消息："+message);
    }


}
