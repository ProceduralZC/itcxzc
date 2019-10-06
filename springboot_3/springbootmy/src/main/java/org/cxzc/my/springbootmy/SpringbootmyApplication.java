package org.cxzc.my.springbootmy;

import org.cxzc.myyoung.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootmyApplication {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    public String index(){
        return helloService.autoInfo();
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootmyApplication.class, args);
    }

}
