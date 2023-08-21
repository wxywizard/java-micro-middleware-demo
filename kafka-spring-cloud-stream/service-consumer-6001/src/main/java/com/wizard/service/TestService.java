package com.wizard.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

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

    @Bean
    public Consumer<String> billChannel1() {
        log.info("billChannel1");
        return message -> log.info("消息："+message);
    }

}
