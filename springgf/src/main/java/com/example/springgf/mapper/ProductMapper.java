package com.example.springgf.mapper;

import com.example.springgf.entity.products;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper {
    void add(products product);
    products getByID(int productID);
}
