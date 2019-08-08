package com.oasis.mvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloAction {
    @RequestMapping("hello.do")
    @ResponseBody
    public String hello(){
        return "hello world";
    }
}
