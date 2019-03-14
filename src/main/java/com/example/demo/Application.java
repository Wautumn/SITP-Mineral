package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableTransactionManagement
@RestController
@ComponentScan({"com.example.demo.dao","com.example.demo.service","com.example.demo.controller"})
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
