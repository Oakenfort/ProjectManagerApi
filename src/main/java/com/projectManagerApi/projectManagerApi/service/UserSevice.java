package com.projectManagerApi.projectManagerApi.service;

import com.projectManagerApi.projectManagerApi.bean.User;
import com.projectManagerApi.projectManagerApi.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevice {
    @Autowired
    private UserDao userDao;


    public User save(User user){
        return userDao.save(user);
    }
    public User findById(Long aLong){
        return userDao.findById(aLong).get();
    }
    public void delete(Long along){
        userDao.deleteById(along);
    }
    public List<User> findAll(){
        return userDao.findAll();
    }
    public User update(long id,User user){
        User user1 = new User();
        user1.setName(user.getName());
        user1.setManager(user.isManager());
        userDao.save(user1);
        return user1;
    }
}
