package com.fma.web;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class BaseController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World";
    }
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BaseController.class, args);
    }
}
