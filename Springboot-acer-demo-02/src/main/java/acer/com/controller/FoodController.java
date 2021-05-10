package acer.com.controller;

import acer.com.bean.Food;
import acer.com.bean.Vegetables;
import acer.com.config.VegetablesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    @Autowired
    private Food food;

    @RequestMapping("/json")
    public Food food(){
        Food f = new Food();
        f.setRice(food.getRice());
        f.setMeat(food.getMeat());
        return f;
    }

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/vegetables")
    public Vegetables vegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setVegetables(vegetablesConfig.getVegetables());

        return vegetables;
    }
}
