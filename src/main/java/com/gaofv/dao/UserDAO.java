package com.gaofv.dao;

import com.gaofv.entity.User;

import java.util.List;

/**
 * @Auther: GF
 * @Date: 2019/10/18
 * @Description: com.gaofv.dao
 * @version: 1.0
 */
public interface UserDAO {
    void insert(User user);

    User selectByUserName(String username);

    List<User> selectAll();

    void update(User user);

    void delete(Integer id);
}
