package com.example.testgit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "web")
public class HelloController {

    /**
    * @Description
    * @Author  Y.sh
    * @Date  2019/9/27 15:49
     *
    */
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("如何拉取");
        return "hello world";
    }

    @RequestMapping(value = "me")
    public String branch(){
        this.hello();
        return "me";
    }
}
