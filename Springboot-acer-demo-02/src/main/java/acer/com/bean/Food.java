package acer.com.bean;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明是一个配置类
 * @ConfigurationProperties
 * 声明是一个配置类，profx写的是前缀
 * properSource
 */
@Configuration
@ConfigurationProperties(prefix = "food")
@PropertySource("classpath:application.properties")
@Getter@Setter
public class Food {

    private String rice;
    private String meat;
    private String[] sauce;

}
