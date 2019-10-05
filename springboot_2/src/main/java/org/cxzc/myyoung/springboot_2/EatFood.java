package org.cxzc.myyoung.springboot_2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Auther 追梦蜗牛
 * @ABOUT  公众号  程序职场
 * @CONTENT  描述信息
 */
@Component
@ConfigurationProperties(prefix = "eat")
@PropertySource("classpath:eat.properties")
public class EatFood {
    private String eatName;
    private int eatprice;

    public String getEatName() {
        return eatName;
    }

    public void setEatName(String eatName) {
        this.eatName = eatName;
    }

    public int getEatprice() {
        return eatprice;
    }

    public void setEatprice(int eatprice) {
        this.eatprice = eatprice;
    }
}
