package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@SpringBootApplication
@RestController
public class DemoApplication  extends SpringBootServletInitializer {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "hello,mineral!";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



   // public static void main(String[] args) {
      //  SpringApplication.run(DemoApplication.class, args);
  //  }




}
