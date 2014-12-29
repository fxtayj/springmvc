package cn.com.duiba.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.duiba.springmvc.dao.UserDAO;
import cn.com.duiba.springmvc.model.User;
import cn.com.duiba.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;
     
    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }
 
}
