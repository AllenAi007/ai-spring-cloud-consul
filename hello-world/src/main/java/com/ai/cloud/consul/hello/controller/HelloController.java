package com.ai.cloud.consul.hello.controller;

import lombok.Setter;
import com.ai.cloud.consul.hello.model.HelloWorld;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
public class HelloController {

    @Setter
    @Value("${ai.welcome}")
    private String welcome;

    @GetMapping("sayHello/{name}")
    public HelloWorld hello(@PathVariable String name) {
        log.info("Calling hello......");
        return HelloWorld
                .withName(this.welcome + ", " + name + "!");
    }

}
