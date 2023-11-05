package com.example.springgf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springgf.common.result;
import com.example.springgf.entity.users;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends IService<users> {
    users login(users user);

    result test();
}
