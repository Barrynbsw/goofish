package com.example.backened.service.imply;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.example.backened.common.result;
import com.example.backened.entity.users;
import com.example.backened.mapper.UserMapper;
import com.example.backened.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IUserService extends ServiceImpl<UserMapper, users>implements UserService {
    @Autowired
    UserMapper userMapper;

    public users login(users user) {
        users u = userMapper.getByName(user.getUsername());
        return u;
    }

    ;

    public result test() {
        List<users> usersList = userMapper.selectall();
        return result.success(usersList);
    }
}
