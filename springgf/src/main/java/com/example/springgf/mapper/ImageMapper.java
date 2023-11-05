package com.example.springgf.mapper;

import com.example.springgf.entity.image;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImageMapper {
   image getByPID(int productID);
}
