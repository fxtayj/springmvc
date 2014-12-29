package cn.com.duiba.springmvc.dao;

import cn.com.duiba.springmvc.model.User;

public interface UserDAO {
	/**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
