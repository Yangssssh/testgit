package com.example.testgit.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "web")
public class HelloController {

    /**
    * @Description  git3.0
    * @Author  Y.sh
    * @Date  2019/9/27 15:49
    */
    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("第 三 次提交");
        return "hello world";
    }
}
