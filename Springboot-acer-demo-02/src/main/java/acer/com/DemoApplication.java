package acer.com;

import acer.com.bean.Food;
import acer.com.config.BraisedChickenConfig;
import acer.com.config.VegetablesConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({Food.class,VegetablesConfig.class, BraisedChickenConfig.class})
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class,args);
    }
}
