package acer.com.config;


import lombok.Getter;
import lombok.Setter;
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
@Getter @Setter
public class BraisedChickenConfig {

    private String chicken;
    private String rice;

}
