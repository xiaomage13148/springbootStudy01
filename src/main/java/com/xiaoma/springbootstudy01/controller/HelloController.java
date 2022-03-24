package com.xiaoma.springbootstudy01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*自动装配：原理*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        /*调用业务层 接收前端参数 */
        return "hello";

    }

}
