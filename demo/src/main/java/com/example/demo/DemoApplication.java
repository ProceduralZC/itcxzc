package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class DemoApplication {

    @GetMapping(value = "/hello",produces = "text/plain;charset=UTF-8")  //RequestMapping ,GetMapping是一个用来处理请求地址映射的注解，可用于类或方法上
    public String Test(){
        return "SpringBoot 第一个项目,在入口类中添加";
    }

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);//默认启动
        // 关闭Banner
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
        //修改Banner的模式为OFF
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }
}
