package com.example.springgf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springgf.entity.users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<users> {

}
