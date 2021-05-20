package acer.com.dao;

import acer.com.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class GuestDao {

    private static ArrayList<Guest> guestList = new ArrayList<Guest>();

    static {
        guestList.add(new Guest("黄晓明","老板"));
        guestList.add(new Guest("秦海璐","财务"));
        guestList.add(new Guest("林述巍","大厨"));
        guestList.add(new Guest("王俊凯","经理"));
        guestList.add(new Guest("杨紫","前台"));
    }

    public ArrayList<Guest> list(){
        return guestList;
    }

    //添加嘉宾
    public void add(Guest guest){
        guestList.add(guest);
    }

    //修改
    public void update(Guest newGuest){
        Guest guest = this.get(newGuest.getName());
        guest.setName(newGuest.getName());
        guest.setRole(newGuest.getRole());
    }

    //获取Guest对象
    public Guest get(String name){
        for (Guest guest : guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }

    //删除
    public void delete(String name){
        guestList.remove(this.get(name));
    }
}
