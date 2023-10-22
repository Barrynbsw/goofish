package com.example.backened.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.example.backened.common.result;
import com.example.backened.entity.users;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<users> {
    users login(users user);

    result test();
}
