package org.cxzc.myyoung.springboot_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController等于@Controller,@ResponseBody两个注解,注解为止在controller类上,相当于整个类中所有方法的返回值都为json字符串
//如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，配置的视图解析器
// InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
@RestController
public class HelloController {
    @Value("${game.enterprise}")
    private String gameEnterprise;
    @Value("${game.name}")
    private String gameName;
    @Value("${game.taste}")
    private String taste;

    @Autowired
    private EatFood eatFood;

    @GetMapping(value = "/prope",produces = "text/plain;charset=UTF-8")
    public String Test2(){
        return "喜欢吃什么："+eatFood.getEatName()+"---价格是多少："+eatFood.getEatprice();
    }

    @GetMapping(value = "/hello",produces = "text/plain;charset=UTF-8")  //RequestMapping ,GetMapping是一个用来处理请求地址映射的注解，可用于类或方法上
    public String Test(){
        return "SpringBoot 第一个项目，单独一个控制类中添加--游戏公司："+gameEnterprise+"---游戏名称："+gameName
                +"---是否感兴趣："+taste;
    }
}
