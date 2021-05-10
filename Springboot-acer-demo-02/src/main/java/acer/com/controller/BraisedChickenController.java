package acer.com.controller;

import acer.com.bean.BraisedChicken;
import acer.com.config.BraisedChickenConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BraisedChickenController {

    @Autowired
    private BraisedChickenConfig braisedChickenConfig;

    @RequestMapping("/braised")
    public BraisedChicken braisedChicken(){
        BraisedChicken braisedChicken = new BraisedChicken();
        braisedChicken.setChicken(braisedChickenConfig.getChicken());
        braisedChicken.setRice(braisedChickenConfig.getRice());
        return braisedChicken;
    }
}
