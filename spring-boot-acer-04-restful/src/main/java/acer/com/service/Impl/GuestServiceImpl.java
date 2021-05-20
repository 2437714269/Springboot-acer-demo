package acer.com.service.Impl;

import acer.com.bean.Guest;
import acer.com.dao.GuestDao;
import acer.com.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    //查询所有嘉宾
    public List<Guest> list() {
        return guestDao.list();
    }

    //添加嘉宾
    public void add(String name, String role) {
        guestDao.add(new Guest(name,role));
    }

    //修改
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    //删除
    public void delete(String name) {
        guestDao.delete(name);
    }



}
