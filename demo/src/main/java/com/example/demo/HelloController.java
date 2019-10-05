package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController等于@Controller,@ResponseBody两个注解,注解为止在controller类上,相当于整个类中所有方法的返回值都为json字符串
//如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，配置的视图解析器
// InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
@RestController
public class HelloController {
//    @GetMapping("/hello")  //RequestMapping ,GetMapping是一个用来处理请求地址映射的注解，可用于类或方法上
//    public String Test(){
//        return "SpringBoot 第一个项目，单独一个控制类中添加";
//    }
}
