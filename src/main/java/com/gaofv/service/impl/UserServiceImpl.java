package com.gaofv.service.impl;

import com.gaofv.entity.User;
import com.gaofv.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: GF
 * @Date: 2019/10/18
 * @Description: com.gaofv.service.impl
 * @version: 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public void add(User user) {

    }

    @Override
    public void modify(User user) {

    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findByUserName(String username) {
        return null;
    }
}
