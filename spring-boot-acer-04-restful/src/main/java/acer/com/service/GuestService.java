package acer.com.service;

import acer.com.bean.Guest;

import java.util.List;

public interface GuestService {

    //查询所有嘉宾
    public List<Guest> list();

    //添加嘉宾
    public void add(String name,String role);

    //修改嘉宾信息
    public void update(Guest guest);

    //删除嘉宾信息
    public void delete(String name);
}
