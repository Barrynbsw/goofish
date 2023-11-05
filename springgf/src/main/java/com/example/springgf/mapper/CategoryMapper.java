package com.example.springgf.mapper;

import com.example.springgf.entity.categories;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<categories> catepage();

    List<categories> getChildrenbyID(int CategoryID);

    categories getByID(int categoryID);

    List<categories> list();

    int getIDByName(String catename);
}
