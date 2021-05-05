package acer.com.controller;

import acer.com.bean.Food;
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
}
