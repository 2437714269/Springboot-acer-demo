package acer.com.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明是一个配置类，去掉xml文件
 * @ConfigurationProperties
 * 声明是一个配置类，并且声明前缀
 * @PropertySource
 * 声明类和文件的地址
 */

@Configuration
@ConfigurationProperties(prefix = "braised")
@PropertySource("classpath:braisedchicken.properties")
public class BraisedChickenConfig {

    private String chicken;
    private String rice;

    public String getChicken() {
        return chicken;
    }

    public void setChicken(String chicken) {
        this.chicken = chicken;
    }

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }
}
