package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.didispace.com
 *
 */
@Controller
public class HelloController {


    @RequestMapping("/hello")

    public String hello() {
        return "/service.html";

    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

}