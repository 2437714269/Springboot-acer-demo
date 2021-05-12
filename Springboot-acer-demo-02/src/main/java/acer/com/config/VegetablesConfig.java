package acer.com.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration
 * 声明是一个配置类
 * @ConfigurationProperties(prefix = "vegetables")
 * 声明是一个配置类，并且声明前缀
 * @PropertySource("classpath:Vegetables.properties")
 * 声明类和文件的地址
 */

@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
@Getter@Setter
public class VegetablesConfig {

    private String potato;
    private String eggplant;
    private String vegetables;

}
