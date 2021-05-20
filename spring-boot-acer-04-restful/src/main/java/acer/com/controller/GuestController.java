package acer.com.controller;

import acer.com.bean.Guest;
import acer.com.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *  控制层 返回视图层
 *  @RequestMapping("/guest")
 *  放在类上面，代表类里面的方法以此开头
 *
 */
@Controller
@RequestMapping("/guest")
public class GuestController {

    /**
     *  0. 展示、新增、修改角色、删除
     *  1.展示所有人员信息的列表name和role
     *    请求：guest/list 无参数，返回值：list.html
     *  2.新增操作 toAdd，点击跳转到add页面，
     *    点击提交按钮发送给controller并重新刷新list列表
     *  3.修改操作 toUpdate 点击跳转到update页面，
     *    点击修改按钮发送到controller并重新刷新数据
     *
     *
     *    html的请求方式改为restful
     *                传统方式API                  restful方式
     *    展示        guest/list           GET     guest                   GET
     *    跳转添加    guest/toAdd          GET     guest/toAdd             GET
     *    添加        guest/add            POST    guest                   POST
     *    跳转修改    guest/toUpdate?name  GET     guest/toUpdate{name}    GET
     *    修改        guest/update         POST    guest                   PUT
     *    删除        guest/delete?name    GET     guest/{name}            DELETE
     */

    @Autowired
    private GuestService guestService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        model.addAttribute("guestList",guestService.list());
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(String name,String role){
        System.out.println(name+"--"+role);
        //判断添加的数据是否为空
        if (!"".equals(name) && name!=null) {
            System.out.println(name + "--" + role);
            guestService.add(name,role);
        }
        return "redirect:/guest";
    }

    /**
     *  将/guest/toUpdate/{name}格式的url映射到此方法
     *  其中name的属性值，通过注解 @PathVariable("name")映射到方法的属性中
     *  其中”name“ 代表去url中查找的属性值
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name,Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "update";
    }

    @PutMapping
    public String update(Guest guest){
        System.out.println(guest.getName()+"-修改-"+guest.getRole());
        guestService.update(guest);
        return "redirect:/guest";
    }


    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        System.out.println(name);
        guestService.delete(name);
        return "redirect:/guest";
    }


}
