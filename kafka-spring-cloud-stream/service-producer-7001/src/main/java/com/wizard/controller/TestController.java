package com.wizard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxy
 * @Classname TestController
 * @Date 2023/8/21 17:10
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private StreamBridge streamBridge;
    @GetMapping("/test1")
    public String test() {
        String str = "{\"test\":\"345\"}";
        streamBridge.send("billChannel-out-0", MessageBuilder.withPayload(str).build());
        return "test";
    }

    @GetMapping("/test2")
    public String test2() {
        String str = "{\"test2\":\"qwer321\"}";
        streamBridge.send("billChannel1-out-0", MessageBuilder.withPayload(str).build());
        return "test";
    }

    @GetMapping("/pending")
    public String pending() {
        String str = "{\"pending\":\"pending,down\"}";
        streamBridge.send("pendingChannel-out-0", MessageBuilder.withPayload(str).build());
        return "pending";
    }


}
