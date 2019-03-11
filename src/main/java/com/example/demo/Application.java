package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/")
    public String index(){
        return "hello,mineral";
    }
    public static void main( String[] args )
    {
        /**
         * 在main方法中进行启动我们的应用程序
         */
        SpringApplication.run(Application.class, args);
    }

}
