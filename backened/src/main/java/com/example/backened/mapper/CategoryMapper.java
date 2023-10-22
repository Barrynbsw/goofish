package com.example.backened.mapper;

import com.example.backened.controller.request.categoryrequest;
import com.example.backened.entity.categories;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<categories> catepage();

    List<categories> getChildrenbyID(int CategoryID);

    categories getByID(int categoryID);
}
