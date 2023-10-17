package com.example.springgf.service.imply;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springgf.entity.users;
import com.example.springgf.mapper.UserMapper;
import com.example.springgf.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class IUserService extends ServiceImpl<UserMapper,users>implements UserService {

}
