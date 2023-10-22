package com.example.backened.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.example.backened.entity.users;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<users> {

    users getByName(String username);

    List<users> selectall();
}
