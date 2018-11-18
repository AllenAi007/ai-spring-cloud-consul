package com.ai.cloud.consul.hello.controller;

import com.ai.cloud.consul.hello.model.HelloWorld;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Setter
    @Value("${ai.welcome}")
    private String welcome;

    @GetMapping("sayHello/{name}")
    public HelloWorld hello(@PathVariable String name) {
        return HelloWorld
                .withName(this.welcome + ", " + name + "!");
    }

}
