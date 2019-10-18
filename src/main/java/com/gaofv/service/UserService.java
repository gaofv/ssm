package com.gaofv.service;

import com.gaofv.entity.User;

import java.util.List;

/**
 * @Auther: GF
 * @Date: 2019/10/18
 * @Description: com.gaofv.service
 * @version: 1.0
 */
public interface UserService {
    void add(User user);

    void modify(User user);

    void remove(Integer id);

    List<User> findAll();

    User findByUserName(String username);
}
