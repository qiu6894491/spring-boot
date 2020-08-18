package com.itstudent.boot.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XueChen
 * @date 2020-08-18 0:13
 */
@RestController
public class TestController{
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
