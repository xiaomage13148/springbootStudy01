package com.xiaoma.springbootstudy01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*自动装配：原理*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        System.out.println("git修改");
        System.out.println("git修改");
        System.out.println("git修改");
        System.out.println("git修改2");
        System.out.println("git修改3");
        System.out.println("git修改7");
        System.out.println("git==pushTest5");
        System.out.println("git=pushTest6");
        System.out.println("git=pushTest7");
        System.out.println("git=pushTest8");
        /*调用业务层 接收前端参数 */
        return "hello";

    }

}
